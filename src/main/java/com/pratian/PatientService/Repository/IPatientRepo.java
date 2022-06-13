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

	@Query(value="select P from Patient P")//from db tables
	public List<Patient> showviewallpatients();

	@Query(value="select P from Patient P where P.id=:id ")
	public Patient showviewallpatientById(@Param(value="id")long id);
}
