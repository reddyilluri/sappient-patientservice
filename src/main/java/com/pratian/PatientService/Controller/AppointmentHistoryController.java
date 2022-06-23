package com.pratian.PatientService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Entities.Feedback;
import com.pratian.PatientService.Entities.PrescriptionHistory;
import com.pratian.PatientService.Exceptions.AppointmentHistoryNotFoundException;
import com.pratian.PatientService.Exceptions.SymptomNotFoundException;
import com.pratian.PatientService.Service.AppointmentHistoryService;
import com.pratian.PatientService.Service.PrescriptionService;
import com.pratian.PatientService.Service.Impl.AppointmentHistoryServiceImpl;
import com.pratian.PatientService.Service.Impl.FeedbackServiceImpl;

import io.swagger.v3.oas.annotations.Operation;




@RestController
@CrossOrigin("*")
@RequestMapping("/showappointmenthistory")


public class AppointmentHistoryController {
	@Autowired
	private AppointmentHistoryService service;
	
	
	@GetMapping("/AppointmentHistory")
	@Operation(summary = "To find AppointmentHistory")
	public List<AppointmentHistory> get() {
	return service.showallAppointmentHistory();
	}
	
	@GetMapping("/AppointmentHistory/{id}")
	public ResponseEntity<?>get(@PathVariable(value = "id") long id) {
		ResponseEntity<?> response=null;
		try {
			response=new ResponseEntity<>(service.getAppointmentHistoryById(id),HttpStatus.OK);
		}catch (AppointmentHistoryNotFoundException e) {
			response=new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
		}
		
		return response;
	
}

}
