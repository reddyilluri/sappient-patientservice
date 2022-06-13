package com.pratian.PatientService.Entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AppointmentHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long appointmentHistoryId;
	private int year;
	private String doctorname;
	private String specialist;
	private String appointmentDate;
	private String comment;
	private long Time;
	
	public long getTime() {
		return Time;
	}
	public void setTime(long time) {
		Time = time;
	}
	public AppointmentHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentHistory(long appointmentHistoryId,int year,String doctorname,String specialist,String appointmentDate,String comment)
	{
		super();
		this.appointmentHistoryId=appointmentHistoryId;
		this.year=year;
		this.doctorname=doctorname;
		this.specialist=specialist;
		this.appointmentDate=appointmentDate;
		this.comment=comment;
		this.Time=Time;
	}
	public long getappointmentHistoryId() 
	{
		return appointmentHistoryId;
	}
	public void setappointmentHistoryId(long appointmentHistoryId) 
	{
		this.appointmentHistoryId = appointmentHistoryId;
	}
	public int getyear() 
	{
		return year;
	}
	public void setyear(int year) 
	{
		this.year = year;
	}
	public String getdoctorname() 
	{
		return doctorname;
	}
	public void setdoctorname(String doctorname) 
	{
		this.doctorname = doctorname;
	}
	public String getspecialist() 
	{
		return specialist;
	}
	public void setspecialist(String specialist) 
	{
		this.specialist = specialist;
	}
	public String getappointmentDate() 
	{
		return appointmentDate;
	}
	public void setappointmentDate(String appointmentDate) 
	{
		this.appointmentDate = appointmentDate;
	}
	public String getcomment() 
	{
		return comment;
	}
	public void setcomment(String comment) 
	{
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "AppointmentHistory [appointmentHistoryId=" + appointmentHistoryId + ", year=" + year + ", doctorname=" + doctorname
				+ ", specialist=" + specialist + ", appointmentDate=" +appointmentDate+",comment=" +comment+", Time="+Time+"]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
