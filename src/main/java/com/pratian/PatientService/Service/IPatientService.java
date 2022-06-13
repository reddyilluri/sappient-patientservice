package com.pratian.PatientService.Service;

import java.util.List;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Entities.Patient;

public interface IPatientService {
	List<Patient> showviewallpatients();
		public Patient showviewallpatientsById(long id);
	
	public List<AppointmentHistory> getAppointments(long id);
	
}
