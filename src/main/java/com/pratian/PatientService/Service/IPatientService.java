package com.pratian.PatientService.Service;

import java.util.List;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Entities.Patient;
import com.pratian.PatientService.Exceptions.PatientNotFoundException;

public interface IPatientService {
	public List<Patient> showviewallpatients();
		
//	public Patient showviewallpatientsById(long id);
	
//	public List<AppointmentHistory> getAppointments(long id);
	
//	public List<AppointmentHistory> showallAppointmentHistory();
	
//	public list<appointmentHistory> showallAppointmentdetails();
	
	//public List<AppointmentHistory> getAppointments(long id);

		// we have to get the patients details by Id
		Patient getPatientDetails(long id) throws PatientNotFoundException;

		// we get save the patient details
		Patient savePatientDetails(Patient patient) throws PatientNotFoundException, PatientNotFoundException;

		// we can edit the patient details
		Patient editPatientDetails(Long patientId, Patient patient) throws PatientNotFoundException;
	
}
