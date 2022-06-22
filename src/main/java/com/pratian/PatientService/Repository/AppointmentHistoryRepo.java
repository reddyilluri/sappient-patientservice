package com.pratian.PatientService.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Entities.Patient;

@Repository
public interface AppointmentHistoryRepo extends JpaRepository<AppointmentHistory, Long>{
	
   @Query(value="select a from AppointmentHistory a")
   public List<AppointmentHistory> showallappointmenthistory();
  
  
   @Query(value="select a from AppointmentHistory a where a.appointmentHistoryId=:id ")
   public AppointmentHistory getAppointmentHistoryById(@Param(value="id")long id);
		
		
	}



