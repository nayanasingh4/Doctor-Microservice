package com.doctor.VO;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class Appointment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aId;
    private int pId;
    private int dId;
    
//    private Date appointmentDate;
    
//    @FutureOrPresent
    private LocalDate appointmentDate;
    
   
    
    
    
//    @Future(message="Invalid future date.")
//    private java.util.Date future;
    
   

//    public Date getAppointmentDate() {
//		return appointmentDate;
//	}
//
//	public void setAppointmentDate(Date appointmentDate) {
//		this.appointmentDate = appointmentDate;
//	}

	
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	/*
     * private Time appointmentStartTime; private Time appointmentEndTime;
     */
    public int getaId() {
        return aId;
    }
//    public Date getAppointmentDate() {
//		return appointmentDate;
//	}
//	public void setAppointmentDate(Date appointmentDate) {
//		this.appointmentDate = appointmentDate;
//	}
	public void setaId(int aId) {
        this.aId = aId;
    }
    public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public int getpId() {
        return pId;
    }
    public void setpId(int pId) {
        this.pId = pId;
    }
    public int getdId() {
        return dId;
    }
    public void setdId(int dId) {
        this.dId = dId;
    }
}