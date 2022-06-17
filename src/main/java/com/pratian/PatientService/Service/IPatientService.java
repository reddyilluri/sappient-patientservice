package com.pratian.PatientService.Service;

import java.util.List;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Entities.Patient;
import com.pratian.PatientService.Exceptions.PatientNotFoundException;

public interface IPatientService { // methods we need are written in interface. we can have as many as methods
	List<Patient> showviewallpatients();
	
	public Patient showviewallpatientsById(long id) throws PatientNotFoundException;
	
	public List<AppointmentHistory> getAppointments(long id);
	
}
