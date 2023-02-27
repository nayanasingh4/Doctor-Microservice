package com.doctor.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
//	private int pId;
//	private int dId;

	private String appointmentDate;

	public Appointment(int i, int j, int k, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

//	public int getpId() {
//		return pId;
//	}
//
//	public void setpId(int pId) {
//		this.pId = pId;
//	}
//
//	public int getdId() {
//		return dId;
//	}
//
//	public void setdId(int dId) {
//		this.dId = dId;
//	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

//	

}