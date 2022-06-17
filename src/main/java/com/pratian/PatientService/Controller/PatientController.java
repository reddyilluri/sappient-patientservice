package com.pratian.PatientService.Controller;
import org.springframework.web.bind.annotation.RestController;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import com.pratian.PatientService.Entities.Patient;
import com.pratian.PatientService.Entities.Symptom;
import com.pratian.PatientService.Exceptions.PatientNotFoundException;
import com.pratian.PatientService.Exceptions.SymptomNotFoundException;
import com.pratian.PatientService.Service.IPatientService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pratian.PatientService.Entities.AppointmentHistory;
	@CrossOrigin(origins="http://localhost:4200")
	@RestController
	@RequestMapping("/viewallpatient")
	public class PatientController
	{
	@Autowired
	private IPatientService service;

	@RequestMapping(value="/getviewallpatients/{id}",method =RequestMethod.GET)//to get a patient using particular id using get method
	@Operation(summary = "to get patient using id")
	public ResponseEntity<?>get1(@PathVariable(value = "id") long id) throws PatientNotFoundException {
		ResponseEntity<?> response=null;
		try {
			response=new ResponseEntity<>(service.showviewallpatientsById(id),HttpStatus.OK);
		}catch (PatientNotFoundException e) {
			response=new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
		}
		
		return response;
	}
	@RequestMapping(value="/getpatients",method =RequestMethod.GET)
	@Operation(summary = "to get all Patients")
	public List<Patient> showviewallpatients() {
		return service.showviewallpatients();
	}
	
	@GetMapping("/appointment/{id}")
	@Operation(summary = "to get appointment using id")
	public List<AppointmentHistory> get(@PathVariable(value="id")long id) {
		return service.getAppointments(id);
	}
	
}




