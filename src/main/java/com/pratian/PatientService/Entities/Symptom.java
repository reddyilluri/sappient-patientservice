package com.pratian.PatientService.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Symptom")
public class Symptom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long symptomId;
	
	//symptomName,reading,doctorname
	
	private String symptomName;
	private String reading;
	private String doctorname;
	
	
	//Constructors
	public Symptom() {
		super();
	}
	
	public Symptom(long symptomId, String symptomName, String reading, String doctorname) {
		super();
		this.symptomId = symptomId;
		this.symptomName = symptomName;
		this.reading = reading;
		this.doctorname = doctorname;
	}
	
	//getter and setter methods
	public long getSymptomId() {
		return symptomId;
	}
	public void setSymptomId(long symptomId) {
		this.symptomId = symptomId;
	}
	public String getSymptomName() {
		return symptomName;
	}
	public void setSymptomName(String symptomName) {
		this.symptomName = symptomName;
	}
	public String getReading() {
		return reading;
	}
	public void setReading(String reading) {
		this.reading = reading;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	
	//Tostring method
	@Override
	public String toString() {
		return "Symptom [symptomId=" + symptomId + ", symptomName=" + symptomName + ", reading=" + reading
				+ ", doctorname=" + doctorname + "]";
	}
}
