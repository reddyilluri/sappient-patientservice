package com.pratian.PatientService.Controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pratian.PatientService.Entities.Patient;
import com.pratian.PatientService.Entities.PrescriptionHistory;
import com.pratian.PatientService.Entities.Symptom;
import com.pratian.PatientService.Exceptions.PatientNotFoundException;
import com.pratian.PatientService.Service.IPatientService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pratian.PatientService.Entities.AppointmentHistory;
import com.pratian.PatientService.Entities.Feedback;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/viewallpatient")
public class PatientController {

	@Autowired
	private IPatientService service;

//	@RequestMapping(value="/getviewallpatients/{id}",method =RequestMethod.GET) //  for getting all patients we use GET API
//	public Patient showviewallpatientById(@PathVariable(value="id")long id) {
//		return service.showviewallpatientsById(id);
//	}

	@RequestMapping(value = "/getpatients", method = RequestMethod.GET)
	public List<Patient> showviewallpatients() {
		return service.showviewallpatients();
	}

//	@RequestMapping(value="/getpatients/{id}",method =RequestMethod.GET)
//	public List<Patient> showviewallpatients(@PathVariable(value="id")long id) {
//		return service.showviewallpatients();
//	}

//	@GetMapping("/appointment/{id}")
//	public List<AppointmentHistory> get(@PathVariable(value = "id") long id) {
//		return service.getAppointments(id);
//	}

	// @RequestMapping(value = "/addpatients", method = RequestMethod.POST) // hear
	// we need to add the patient info by
	@PostMapping("/addpatients") // using POST API
	@Operation(summary = "To add patient Details")
	public ResponseEntity<?> get(@RequestBody Patient patient) throws PatientNotFoundException {

		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<Patient>(service.savePatientDetails(patient), HttpStatus.OK);
		} catch (PatientNotFoundException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
		return response;
	}

	@RequestMapping(value = "/getviewallpatients/{id}", method = RequestMethod.GET) // hear we need to getting the
																					// patient info by using GET API and
																					// by using ID
	@Operation(summary = "To get patient Details by Id")
	public ResponseEntity<?> showviewallpatientById(@PathVariable(value = "id") long id)
			throws PatientNotFoundException {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.getPatientDetails(id), HttpStatus.OK);
		} catch (PatientNotFoundException e) {
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}

		return response;
	}

	@RequestMapping(value = "/updatepatientdetails/{id}", method = RequestMethod.PUT) // hear we need to edit the
	@PutMapping("/updatepatientdetails/{id}") // patient info by using PUT API
	@Operation(summary = "To update the Patient Details")
	public ResponseEntity<?> put(@PathVariable(value = "id") Long id, @RequestBody Patient patient)
			throws PatientNotFoundException {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<Patient>(service.editPatientDetails(id, patient), HttpStatus.OK);
		} catch (PatientNotFoundException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

		return response;
	}

}
