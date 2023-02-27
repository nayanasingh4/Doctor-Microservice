package com.doctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.Entity.Doctor;
import com.doctor.Service.DoctorService;






@RestController
public class DoctorController {
	@Autowired
	public DoctorService doctorService;

	@GetMapping("/doctors")
	public List<Doctor> getDoctors() {
		return this.doctorService.getAllDoctor();
	}

	@GetMapping("/doctors/specialization/{specialization}")
	public List<Doctor> getBySpecialization(@PathVariable("specialization") String specialization) {
		return this.doctorService.getDoctorBySpecialization(specialization);
	}

	@GetMapping("/doctors/{dId}")
	public Doctor getDoctor(@PathVariable("dId") int dId) {
		return doctorService.getDoctorById(dId);
	}

	@GetMapping("/doctors/appid/{aid}")
	public Doctor getDoctorByaId(@PathVariable("aid") int aid) {
		return doctorService.getDoctorByaId(aid);
	}

	@PostMapping("/doctors")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		Doctor b = this.doctorService.saveDoctor(doctor);
		System.out.println(doctor);
		return b;
	}

//	@DeleteMapping("/doctors/{doctorid}")
//	public void deleteDoctor(@PathVariable("doctorid") int doctorid) {
//		this.doctorService.deleteDoctorById(doctorid);
//
//	}
	
	@DeleteMapping("/doctors/{doctorid}")
	public void deleteDoctor(@PathVariable("doctorid") int doctorid) {
	    boolean success = doctorService.delete(doctorid);

	    if(!success)
	        throw new UserNotFoundException("User id = " + doctorid);

	}


	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public class UserNotFoundException extends RuntimeException {

	    public UserNotFoundException(String message) {
	        super(message);
	    }
	}

	@PutMapping("/doctors/{doctorId}")
	public Doctor updateDoctor(@RequestBody Doctor doctor, @PathVariable("doctorId") int doctorId) {
		this.doctorService.updateDoctor(doctor, doctorId);
		return doctor;
	}
	
//	@GetMapping("/doctors/dId/{did}")
//	  public ResponseTemplate getAppointmentByaId(@PathVariable("did") int did) {
//	  	return doctorService.getDoctorBydId(did);
//	  }
//	
//	@GetMapping("/doctors/doctorId/{did}")
//	  public ResponseTemplate getAppointmentByaId(@PathVariable("did") int did) {
//	  	return doctorService.getDoctorBydId(did);
//	  }
	


}

