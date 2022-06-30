package com.pratian.PatientService.Service.Impl;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pratian.PatientService.Entities.Patient;
import com.pratian.PatientService.Exceptions.PatientAlreadyExistsException;
import com.pratian.PatientService.Exceptions.PatientNotFoundException;
import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Repository.IPatientRepo;
import com.pratian.PatientService.Service.IPatientService;

@Service
public class PatientServiceImpl implements IPatientService {
	@Autowired
	IPatientRepo patientRepo;

	@Override
	public List<Patient> showviewallpatients() {
		// TODO Auto-generated method stub
		return patientRepo.showviewallpatients();
	}

//	@Override
//	public Patient showviewallpatientsById(long id) {
//		// TODO Auto-generated method stub
//		return patientRepo.showviewallpatientById(id);
//	}

//	@Override
//	public List<AppointmentHistory> getAppointments(long id) 
//	{
//		
//		return patientRepo. getPatientByPatientId(id).getAppointmenthistory();
//	}

//	@Override
//	public List<AppointmentHistory> getAppointments(long id) {
//
//		return patientRepo.getPatientByPatientId(id).getAppointmenthistory();
//	}

	@Override
	public Patient getPatientDetails(long id) throws PatientNotFoundException {

		Patient patientDetails = patientRepo.findById(id)
				.orElseThrow(() -> new PatientNotFoundException("Patient id is not found, Enter Correct Patient Id "));
		return patientDetails;
	}

	@Override
	public Patient savePatientDetails(Patient patient) throws PatientAlreadyExistsException {
		if (patientRepo.existsById(patient.getPatientId())) {
			throw new PatientAlreadyExistsException("Patient Already Exists ");
		} else {
			return patientRepo.saveAndFlush(patient);
		}

	}

//	@Override
//	public Patient savePatientDetails(Patient patient) throws PatientNotFoundException {
//		List<Patient> te = patientRepo.findAll().stream().filter(t -> t.getSymptoms().equals(patient.getSymptoms()))
//				.collect(Collectors.toList());
//
//		if (te.size() > 0) {
//			throw new PatientNotFoundException("Patient id is not found, Enter Correct Patient Id ");
//		}
//
//		return patientRepo.save(patient);
//	}

	//
	@Override
	public Patient editPatientDetails(Long patientId, Patient patient) throws PatientNotFoundException {
		Patient patient1 = patientRepo.findById(patient.getPatientId())
				.orElseThrow(() -> new PatientNotFoundException("Patient id is not found, Enter Correct Patient Id "));
		patient1.setName(patient.getName());
		patient1.setPhone(patient.getPhone());
		patient1.setLocation(patient.getLocation());
		patient1.setImageurl(patient.getImageurl());
		patient1.setAge(patient.getAge());
		patient1.setMail(patient.getMail());
		patient1.setBloodgroup(patient.getBloodgroup());
		patient1.setHeight(0);
		patient1.setGender(patient.getGender());
		patient1.setTitle(patient.getTitle());
		patient1.setDOB(patient.getDOB());
		patient1.setAllergies(patient.getAllergies());
		patient1.setActiveissues(patient.getActiveissues());
		patient1.setMedicalproblems(patient.getMedicalproblems());

		return patientRepo.save(patient1);
	}

}
