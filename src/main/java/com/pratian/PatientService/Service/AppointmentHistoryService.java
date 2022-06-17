package com.pratian.PatientService.Service;

import java.util.List;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Entities.Patient;
import com.pratian.PatientService.Entities.PrescriptionHistory;


public interface AppointmentHistoryService  {
	
	public List<AppointmentHistory> showallAppointmentHistory();
	
	public AppointmentHistory getAppointmentHistoryById(long id);
	
}



