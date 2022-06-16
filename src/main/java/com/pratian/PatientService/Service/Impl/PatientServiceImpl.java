package com.pratian.PatientService.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pratian.PatientService.Entities.Patient;
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
	public Patient showviewallpatientsById(long id) {
		// TODO Auto-generated method stub
		return patientRepo.showviewallpatientById(id);
	}


	@Override
	public List<AppointmentHistory> getAppointments(long id) 
	{
		
		return patientRepo.getPatientByPatientId(id).getAppointmenthistory();
	}

}
