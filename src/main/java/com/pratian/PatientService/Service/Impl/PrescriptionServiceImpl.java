package com.pratian.PatientService.Service.Impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pratian.PatientService.Entities.PrescriptionHistory;
import com.pratian.PatientService.Exceptions.PrescriptionNotFoundException;
import com.pratian.PatientService.Repository.PrescriptionRepo;
import com.pratian.PatientService.Service.PrescriptionService;

@SuppressWarnings("unused")
@Service
public class PrescriptionServiceImpl implements PrescriptionService{

@Autowired
private PrescriptionRepo repo;


@Override
public List<PrescriptionHistory> getPrescription() {	

return repo.getPrescription();
}
@Override
public PrescriptionHistory getPrescriptionById(long id) {

return repo.getPrescriptionById(id);
}


}
