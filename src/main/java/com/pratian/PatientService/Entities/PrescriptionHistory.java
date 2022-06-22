package com.pratian.PatientService.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Prescription")
public class PrescriptionHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long prescriptionId;
	// Symptoms,PrescriptionDate,Medicines;
	private String symptoms;
	private String prescriptionDate;
	private String currentDate;
	private String time;
	private String medicines;

	public PrescriptionHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrescriptionHistory(long prescriptionId, String symptoms, String prescriptionDate, String currentDate,
			String time, String medicines) {
		super();
		this.prescriptionId = prescriptionId;
		this.symptoms = symptoms;
		this.prescriptionDate = prescriptionDate;
		this.currentDate = currentDate;
		this.time = time;
		this.medicines = medicines;
	}

	public long getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(long prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getPrescriptionDate() {
		return prescriptionDate;
	}

	public void setPrescriptionDate(String prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getMedicines() {
		return medicines;
	}

	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "PrescriptionHistory [prescriptionId=" + prescriptionId + ", symptoms=" + symptoms
				+ ", prescriptionDate=" + prescriptionDate + ", currentDate=" + currentDate + ", time=" + time
				+ ", medicines=" + medicines + "]";
	}

}
