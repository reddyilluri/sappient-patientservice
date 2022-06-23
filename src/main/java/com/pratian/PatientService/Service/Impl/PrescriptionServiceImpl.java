package com.pratian.PatientService.Service.Impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pratian.PatientService.Entities.PrescriptionHistory;
import com.pratian.PatientService.Exceptions.PrescriptionNotFoundException;
import com.pratian.PatientService.Repository.IPatientRepo;
import com.pratian.PatientService.Repository.PrescriptionRepo;
import com.pratian.PatientService.Service.PrescriptionService;

@SuppressWarnings("unused")
@Service
public class PrescriptionServiceImpl implements PrescriptionService{

@Autowired
private PrescriptionRepo repo;

@Autowired
private IPatientRepo prepo;

@Override
public List<PrescriptionHistory> getPrescription() {	

return repo.getPrescription();
}
@Override
public List<PrescriptionHistory> getPrescriptionById(long id) throws PrescriptionNotFoundException {
	List<PrescriptionHistory> prescriptions =  prepo.showviewallpatientById(id).getPrescriptionhistory();
	if(prescriptions.isEmpty()) {
		throw new PrescriptionNotFoundException("Prescription history is not found");
	}
return prescriptions;
}


}
