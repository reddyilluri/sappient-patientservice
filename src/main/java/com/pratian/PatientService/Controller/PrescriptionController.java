package com.pratian.PatientService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratian.PatientService.Entities.PrescriptionHistory;
import com.pratian.PatientService.Service.PrescriptionService;

import io.swagger.v3.oas.annotations.Operation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/PrescriptionHistory")
public class PrescriptionController {
	
		@Autowired
		private PrescriptionService service;
		@GetMapping("/Prescription")
		@Operation(summary = "To find PrescriptionHistory")
		public List<PrescriptionHistory> get() {
		return service.getPrescription();
		}
		@GetMapping("/Prescription/{id}")
		public PrescriptionHistory get(@PathVariable(value="id")long id) {
		return service.getPrescriptionById(id);

		
	}

}
