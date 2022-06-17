package com.pratian.PatientService.Service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Entities.PrescriptionHistory;
import com.pratian.PatientService.Exceptions.PrescriptionNotFoundException;
import com.pratian.PatientService.Repository.AppointmentHistoryRepo;
import com.pratian.PatientService.Repository.PrescriptionRepo;
import com.pratian.PatientService.Service.AppointmentHistoryService;
import com.pratian.PatientService.Service.PrescriptionService;

@Service
public class AppointmentHistoryServiceImpl implements AppointmentHistoryService {
	
@Autowired
private AppointmentHistoryRepo repo;

@Override
public List<AppointmentHistory> showallAppointmentHistory() {
	
	return repo.showallappointmenthistory();
}

@Override
public AppointmentHistory getAppointmentHistoryById(long id) {
	// TODO Auto-generated method stub
	return repo.getAppointmentHistoryById(id);
}
	

}
