package com.pratian.PatientService.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pratian.PatientService.Entities.Patient;
import com.pratian.PatientService.Entities.Symptom;
import com.pratian.PatientService.Exceptions.PatientNotFoundException;
import com.pratian.PatientService.Exceptions.SymptomNotFoundException;
import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Repository.IPatientRepo;
import com.pratian.PatientService.Service.IPatientService;

@Service
public class PatientServiceImpl implements IPatientService 
{
	@Autowired
	IPatientRepo patientRepo;
	@Override
	public List<Patient> showviewallpatients() { // when we execute this, this will call IPatientRepo class and it implements showviewallpatients method and returns the value generated
		// TODO Auto-generated method stub
		return patientRepo.showviewallpatients();
	}

	@Override
	public Patient showviewallpatientsById(long id) throws PatientNotFoundException {
//		Symptom symptom=repo.findById(id).orElseThrow(()->
//		new SymptomNotFoundException("Symptom Id does not exist"));
//		return symptom;
		Patient patient = patientRepo.findById(id).orElseThrow(()->
		new PatientNotFoundException("Patient Id does not exist, Enter Correct Patient ID"));
		return patient;
	}


	@Override
	public List<AppointmentHistory> getAppointments(long id) 
	{
		
		return patientRepo.getPatientByPatientId(id).getAppointmenthistory();
	}

}
