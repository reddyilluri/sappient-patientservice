package com.pratian.PatientService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pratian.PatientService.Entities.Symptom;

@Repository
public interface SymptomRepo extends JpaRepository<Symptom, Long>{
	
	@Query(value="select s from Symptom s")
	public List<Symptom>getSymptoms();
	
	@Query(value="select s from Symptom s where s.symptomId=:id ")
	public Symptom getSymptomById(@Param(value="id")long id);

}
