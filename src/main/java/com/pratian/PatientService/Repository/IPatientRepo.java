package com.pratian.PatientService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pratian.PatientService.Entities.Patient;

@Repository
public interface IPatientRepo extends JpaRepository<Patient, Long>{
	
	
	public Patient getPatientByPatientId(long id);

	@Query(value="select P from Patient P")//query from db tables to get all list of patients
	public List<Patient> showviewallpatients();// method we created in service class

	@Query(value="select P from Patient P where P.id=:id ")//query from db tables to get a particular patient using id
	public Patient showviewallpatientById(@Param(value="id")long id);
	
//	@Query(value="select A from Appointmenthistory A where A.id=:id ")
//	public Patient AppointmentHistory(@Param(value="id")long id);


}
