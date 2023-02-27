package com.doctor.Entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dId;
	private String name;
	private String specialization;
	private int aId;
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Appointment> appointment;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "Doctor_Id",referencedColumnName = "dId")
	
//	private List<Appointment> appointment;
	
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinTable(name = "Doctor_App", joinColumns = { @JoinColumn(name = "Doctor_ID") }, inverseJoinColumns = {
//			@JoinColumn(name = "App_ID") })
//	private Set<Appointment> appointment;

	

//	public List<Appointment> getAppointment() {
//		return appointment;
//	}
//
//	public void setAppointment(List<Appointment> appointment) {
//		this.appointment = appointment;
//	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public Doctor(int dId, String name, String specialization, int aId) {
		super();
		this.dId = dId;
		this.name = name;
		this.specialization = specialization;
		this.aId = aId;
	}
//
//	public Set<Appointment> getAppointment() {
//		return appointment;
//	}
//
//	public void setAppointment(Set<Appointment> appointment) {
//		this.appointment = appointment;
//	}

	public Doctor() {
		super();

	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

}
