package com.doctor.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.doctor.Entity.Doctor;



public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

	public Doctor findById(int dId);

	public List<Doctor> findBySpecialization(String specialization);

	public Doctor getDoctorByaId(int aid);

	public Doctor findBydId(int did);

}
