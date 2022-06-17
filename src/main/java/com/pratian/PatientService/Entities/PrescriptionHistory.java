package com.pratian.PatientService.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Prescription")
public class PrescriptionHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long PrescriptionId;
	//Symptoms,PrescriptionDate,Medicines;
	private String Symptoms;
	private String PrescriptionDate;
	private String CurrentDate;
	private String Time;
	private String Medicines;
		

	public PrescriptionHistory() {
		super();
		
	}
	
	public PrescriptionHistory(long PrescriptionId, String Symptoms,String PrescriptionDate, String Medicine, String medicines, String Time, String CurrentDate) {
		super();
		this.PrescriptionId=PrescriptionId;
		this.Symptoms=Symptoms;
		this.PrescriptionDate=PrescriptionDate;
		this.CurrentDate=CurrentDate;
		this.Time=Time;
		this.Medicines=medicines;
		
		
	}
	public String getCurrentDate() {
		return CurrentDate;
	}

	public void setCurrentDate(String currentDate) {
		CurrentDate = currentDate;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public long getPrescriptionId() {
		return PrescriptionId;
	}
	public void setPrescriptionId(long PrescriptionId) {
		this.PrescriptionId = PrescriptionId;
	}
	
	public String getSymptoms() {
		return Symptoms;
	}
	public void setSymptoms(String symptoms) {
		Symptoms = symptoms;
	}
	public String getPrescriptionDate() {
		return PrescriptionDate;
	}
	public void setPrescriptionDate(String prescriptionDate) {
		PrescriptionDate = prescriptionDate;
	}
	public String getMedicines() {
		return Medicines;
	}
	public void setMedicines(String medicines) {
		Medicines = medicines;
	}
	//ToString method
	@Override
    public String toString() {
        return "Presccription [PrescriptionId=" + PrescriptionId + ", symptoms=" + Symptoms + ", PrescriptionDate=" + PrescriptionDate
                + ", Medicines=" + Medicines +" ,Time=" + Time + ",CurrentDate=" + CurrentDate +"]";
	}
	}

