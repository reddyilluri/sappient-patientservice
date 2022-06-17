package com.pratian.PatientService.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratian.PatientService.Entities.Symptom;
import com.pratian.PatientService.Exceptions.SymptomNotFoundException;
import com.pratian.PatientService.Repository.SymptomRepo;
import com.pratian.PatientService.Service.SymptomService;

@Service
public class SymptomServiceImpl implements SymptomService{

	@Autowired
	private SymptomRepo repo;
	
	
	@Override
	public List<Symptom> getSymptoms()throws SymptomNotFoundException  {
		
		List<Symptom> symptoms = repo.getSymptoms();
		if(symptoms.isEmpty()) {
			throw new SymptomNotFoundException("Symptom history is not found.please add any symptom");
		}
		return symptoms;
	}

	@Override
	public Symptom addSymptom(Symptom symptom) throws SymptomNotFoundException {
		if(repo.existsById(symptom.getSymptomId())) {
			throw new SymptomNotFoundException("The Symptom is already exists");
		}
		else {
			
			return repo.saveAndFlush(symptom);
		}
		
	}

	@Override
	public Symptom getSymptomById(long id) throws SymptomNotFoundException{
		
		Symptom symptom=repo.findById(id).orElseThrow(()->
		new SymptomNotFoundException("Symptom Id does not exist"));
		return symptom;
	}

	@Override
	public Symptom editSymptom(long symptomId,Symptom symptom) throws SymptomNotFoundException {
		Symptom symptom3=repo.findById(symptom.getSymptomId())
				.orElseThrow(()->new SymptomNotFoundException("symptom id not found,Enter correct Symptom id"));
		symptom3.setSymptomName(symptom.getSymptomName());
		symptom3.setReading(symptom.getReading());
		symptom3.setDoctorname(symptom.getDoctorname());
		
		
		return repo.save(symptom3);
	}

	@Override
	public String deleteSymptom(long id)throws SymptomNotFoundException{
		Symptom symptom=repo.findById(id).orElseThrow(()->
		new SymptomNotFoundException("Symptom Id does not exist"));
		repo.deleteById(id);
		return "deleted";
	}
	
}
