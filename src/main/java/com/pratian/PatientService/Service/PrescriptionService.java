package com.pratian.PatientService.Service;
import java.util.List;
import com.pratian.PatientService.Entities.PrescriptionHistory;
import com.pratian.PatientService.Exceptions.PrescriptionNotFoundException;

@SuppressWarnings("unused")
public interface PrescriptionService {
 
	public List<PrescriptionHistory> getPrescription();

    public List<PrescriptionHistory> getPrescriptionById(long id) throws PrescriptionNotFoundException;

 }
