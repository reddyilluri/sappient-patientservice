package com.pratian.PatientService.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratian.PatientService.Entities.Symptom;
import com.pratian.PatientService.Exceptions.SymptomNotFoundException;
import com.pratian.PatientService.Service.SymptomService;

import io.swagger.v3.oas.annotations.Operation;

@CrossOrigin
@RestController
@RequestMapping("/symptom")
public class SymptomController {

	private static Logger logger = LoggerFactory.getLogger(SymptomController.class);

	@Autowired
	private SymptomService service;

	/*
	 * Method to handle API request to get symptoms
	 * 
	 * @return
	 */
	@RequestMapping("/symptoms")
	@Operation(summary = "To find all symptoms")
	public ResponseEntity<?> get() {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.getSymptoms(), HttpStatus.OK);
		} catch (SymptomNotFoundException e) {
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
		return response;
	}

	/*
	 * Method to handle API request to add symptoms
	 * 
	 * @param symptom
	 * 
	 * @return
	 */
	@RequestMapping("/addsymptom")
	@Operation(summary = "To Add Symptom")
	public ResponseEntity<?> post(@RequestBody Symptom symptom) {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<Symptom>(service.addSymptom(symptom), HttpStatus.OK);

		} catch (SymptomNotFoundException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
		return response;
	}

	/*
	 * Method to handle API request to get symptoms by id
	 * 
	 * @param id
	 * 
	 * @return
	 */
	@RequestMapping("/get/{id}")
	@Operation(summary = "To find symptom by using id")
	public ResponseEntity<?>get(@PathVariable(value = "id") long id) {
		ResponseEntity<?> response=null;
		try {
			response=new ResponseEntity<>(service.getSymptomById(id),HttpStatus.OK);
		}catch (SymptomNotFoundException e) {
			response=new ResponseEntity<>(e.getMessage(),HttpStatus.OK);
		}
		
		return response;
	}

	/*
	 * Method to handle API request to edit symptoms
	 * 
	 * @return
	 */
	@PutMapping("/edit")
	@Operation(summary = "To edit Symptom details")
	public ResponseEntity<?> put(@RequestBody Symptom symptom) throws SymptomNotFoundException {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<Symptom>(service.editSymptom(symptom), HttpStatus.OK);
		} catch (SymptomNotFoundException e) {
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
		return response;
	}

	/*
	 * Method to handle API request to delete symptom by id
	 * 
	 * @param id
	 * 
	 * @return
	 */
	@DeleteMapping("/delete/{id}")
	@Operation(summary = "To delete Symptom by using id")
	public ResponseEntity<?> delete(@PathVariable(value = "id") long id) {
		ResponseEntity<?> response = null;

		response = new ResponseEntity<>(service.deleteSymptom(id), HttpStatus.OK);
		return response;
	}

}
