package com.doctor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.doctor.Entity.Doctor;
import com.doctor.Repository.DoctorRepository;
import com.doctor.VO.Patient;
import com.doctor.VO.ResponseTemplate;

@Service

public class DoctorService {

//	@Autowired
//	public RestTemplate restTemplate;

	@Autowired
	private DoctorRepository doctorRepository;

	// Create doctor
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	// get doctor list
	public List<Doctor> getAllDoctor() {
		List<Doctor> list = (List<Doctor>) this.doctorRepository.findAll();
		return list;
	}

	// get doctor by id
	public Doctor getDoctorById(int dId) {
		return doctorRepository.findById(dId);
	}

	// update doctor
	public void updateDoctor(Doctor doctor, int doctorId) {

		doctor.setdId(doctorId);
		doctorRepository.save(doctor);
	}

	// delete doctor by id
	public void deleteDoctorById(int dId) {
		doctorRepository.deleteById(dId);
	}

	// delete all
	public void deleteDoctor() {
		doctorRepository.deleteAll();
	}

	// find doctor by specialization
	public List<Doctor> getDoctorBySpecialization(String specialization) {
		List<Doctor> list1 = (List<Doctor>) this.doctorRepository.findBySpecialization(specialization);
		return list1;
	}

	public Doctor getDoctorByaId(int aid) {
		return doctorRepository.getDoctorByaId(aid);
	}

	public boolean delete(int doctorid) {
		
		return false;
	}

//	public ResponseTemplate getDoctorBydId(int did) {
//		ResponseTemplate vo = new ResponseTemplate();
//		Doctor doctor = this.doctorRepository.findBydId(did);
//		Patient patient = restTemplate.getForObject("http://localhost:8007/patient/pid/" + doctor.getaId(),
//				Patient.class);
//		vo.setPatient(patient);
//		vo.setDoctor(doctor);
//		return vo;
//	}

//	public ResponseTemplate getPatientBydId(int did) {
//		ResponseTemplate vo= new ResponseTemplate();
//		Doctor doctor= this.doctorRepository.findBydId(did);
//		Patient patient=restTemplate.getForObject("http://localhost:8007/patient/doctorid/" + doctor.getaId(), Patient.class);
//		vo.setPatient(patient);
//		vo.setDoctor(doctor);
//		return vo;
//	}

}
