package com.pratian.PatientService.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(nullable = false, updatable = false)
	
	private Long patientId;
	private String  name;
	private String phone;
	private String location;
	private String imageurl;
	private String age;
	private String mail;
	private String bloodgroup;
	private int height;
	private String Gender;
	private String title;
	private String DOB;
	private String allergies;
	private String activeissues;
	private String medicalproblems; 
	@OneToMany(cascade = CascadeType.ALL) // (targetEntity = Symptom.class)
	@JoinColumn(name = "Patient_patientId")
	private List<Symptom> symptoms = new ArrayList<Symptom>();

	@OneToMany(cascade = CascadeType.ALL) // (targetEntity = AppointmentHistory.class)
	@JoinColumn(name = "Patient_patientId")
	private List<AppointmentHistory> appointmenthistory = new ArrayList<AppointmentHistory>();

	@OneToMany (cascade = CascadeType.ALL)// (targetEntity = PrescriptionHistory.class)
	@JoinColumn(name = "Patient_patientId")
	private List<PrescriptionHistory> prescriptionhistory = new ArrayList<PrescriptionHistory>();

	@OneToMany(cascade = CascadeType.ALL) // (targetEntity = Feedback.class)
	@JoinColumn(name = "Patient_patientId")
	private List<Feedback> feedback = new ArrayList<Feedback>();

	
	
	public Patient() {} //constructor
	
	//constructor parameters


	public Patient(Long patientId, String name, String phone, String location, String imageurl, String age, String mail,
			String bloodgroup, int height, String gender, String title, String dOB, String allergies,		String activeissues, String medicalproblems,
			List<Symptom> symptoms,List<AppointmentHistory> appointmenthistory, List<PrescriptionHistory> prescriptionhistory,List<Feedback> feedback) 
			{
		super();
		this.patientId = patientId;
		this.name = name;
		this.phone = phone;
		this.location = location;
		this.imageurl = imageurl;
		this.age = age;
		this.mail = mail;
		this.bloodgroup = bloodgroup;
		this.height = height;
		Gender = gender;
		this.title = title;
		DOB = dOB;
		this.allergies = allergies;
		this.activeissues = activeissues;
		this.medicalproblems = medicalproblems;
		this.symptoms = symptoms;
		this.appointmenthistory = appointmenthistory;
		this.prescriptionhistory = prescriptionhistory;
		this.feedback = feedback;
	}
	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getActiveissues() {
		return activeissues;
	}

	public void setActiveissues(String activeissues) {
		this.activeissues = activeissues;
	}

	public String getMedicalproblems() {
		return medicalproblems;
	}

	public void setMedicalproblems(String medicalproblems) {
		this.medicalproblems = medicalproblems;
	}

	public List<Symptom> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
	}

	public List<AppointmentHistory> getAppointmenthistory() {
		return appointmenthistory;
	}

	public void setAppointmenthistory(List<AppointmentHistory> appointmenthistory) {
		this.appointmenthistory = appointmenthistory;
	}

	public List<PrescriptionHistory> getPrescriptionhistory() {
		return prescriptionhistory;
	}

	public void setPrescriptionhistory(List<PrescriptionHistory> prescriptionhistory) {
		this.prescriptionhistory = prescriptionhistory;
	}

	public List<Feedback> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}
	

	
	
	
}

