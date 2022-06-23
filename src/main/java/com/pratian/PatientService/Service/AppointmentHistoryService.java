package com.pratian.PatientService.Service;

import java.util.List;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Exceptions.AppointmentHistoryNotFoundException;


public interface AppointmentHistoryService  {
	
	public List<AppointmentHistory> showallAppointmentHistory();
	
	public List<AppointmentHistory> getAppointmentHistoryById(long id) throws AppointmentHistoryNotFoundException;
	
}
