package com.pratian.PatientService.Controller;
import org.springframework.web.bind.annotation.RestController;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import com.pratian.PatientService.Entities.Patient;
	import com.pratian.PatientService.Service.IPatientService;
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
	@RequestMapping(value="/getviewallpatients/{id}",method =RequestMethod.GET)
	public Patient showviewallpatientById(@PathVariable(value="id")long id) {
		return service.showviewallpatientsById(id);
	}
	@RequestMapping(value="/getpatients",method =RequestMethod.GET)
	public List<Patient> showviewallpatients() {
		return service.showviewallpatients();
	}
	@GetMapping("/appointment/{id}")
	
	public List<AppointmentHistory> get(@PathVariable(value="id")long id) {
	return service.getAppointments(id);
	}
}




