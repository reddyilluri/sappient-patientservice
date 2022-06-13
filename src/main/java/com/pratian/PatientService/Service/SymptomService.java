package com.pratian.PatientService.Service;

import java.util.List;

import com.pratian.PatientService.Entities.Symptom;
import com.pratian.PatientService.Exceptions.SymptomNotFoundException;

public interface SymptomService {

public List<Symptom> getSymptoms() throws SymptomNotFoundException;
	
	public Symptom addSymptom(Symptom symptom) throws SymptomNotFoundException;
	
	public Symptom getSymptomById(long id) throws SymptomNotFoundException;
	
	public Symptom editSymptom(Symptom symptom) throws SymptomNotFoundException;
	
	public String deleteSymptom(long id);
}
