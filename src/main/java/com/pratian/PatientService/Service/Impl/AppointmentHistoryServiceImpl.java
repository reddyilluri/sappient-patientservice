package com.pratian.PatientService.Service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Exceptions.AppointmentHistoryNotFoundException;
import com.pratian.PatientService.Repository.AppointmentHistoryRepo;
import com.pratian.PatientService.Repository.IPatientRepo;
import com.pratian.PatientService.Service.AppointmentHistoryService;

@Service
public class AppointmentHistoryServiceImpl implements AppointmentHistoryService {
	
@Autowired
private AppointmentHistoryRepo repo;

@Autowired
private IPatientRepo prepo;

@Override
public List<AppointmentHistory> showallAppointmentHistory() {
	
	return repo.showallappointmenthistory();
}

@Override
public List<AppointmentHistory> getAppointmentHistoryById(long id) throws AppointmentHistoryNotFoundException {
	// TODO Auto-generated method stub
	List<AppointmentHistory> appointmentHistory = prepo.showviewallpatientById(id).getAppointmenthistory();
	if(appointmentHistory.isEmpty()) {
		throw new AppointmentHistoryNotFoundException("appointment history is not found");
	}
	else
	return appointmentHistory;
	
}
	

}
