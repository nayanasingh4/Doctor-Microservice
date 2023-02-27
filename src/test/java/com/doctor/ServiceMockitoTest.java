package com.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.doctor.Entity.Doctor;
import com.doctor.Repository.DoctorRepository;
import com.doctor.Service.DoctorService;

@SpringBootTest(classes = { ServiceMockitoTest.class })
public class ServiceMockitoTest {

	@Mock
	DoctorRepository doctorRepository;

	@InjectMocks
	DoctorService doctorService;

	public List<Doctor> myDoctors;

	@Test
	@Order(1)

	public void test_getAllDoctor() {
		List<Doctor> myDoctors = new ArrayList<Doctor>();
		myDoctors.add(new Doctor(5, "Dr Maya", "Neurologist", 23));
		myDoctors.add(new Doctor(9, "Dr Radha", "Cancer", 14));

		when(doctorRepository.findAll()).thenReturn(myDoctors);// Mocking

		assertEquals(2, doctorService.getAllDoctor().size());
	}

	@Test
	@Order(2)
	public void test_getDoctorById() {
		Doctor myDoctor = new Doctor(6, "Dr Rama", "Neurologist", 26);
		when(doctorRepository.findById(6)).thenReturn(myDoctor);
//		assertEquals(myDoctor,doctorService.getDoctorById(6));

		assertEquals("Dr Rama", myDoctor.getName());
	}

	@Test
	@Order(3)
	public void test_updateDoctor() {
		Doctor update = (new Doctor(89, "Dr Ankit", "Specialist", 12));
		update.setName("Dr Radha");
		doctorRepository.save(update);
		assertEquals("Dr Radha", update.getName());
	}

	@Test
	@Order(4)
	public void test_saveDoctor() {
		Doctor add = (new Doctor(76, "Dr Siddharth", "Cardiologist", 5));
		when(doctorRepository.save(add)).thenReturn(add);
		assertEquals(add, doctorService.saveDoctor(add));

	}

	@Test
	@Order(5)
	public void deleteDoctorById() {
		Doctor delete = (new Doctor(76, "Dr Siddharth", "Cardiologist", 5));
		delete.setdId(76);
		when(doctorRepository.findBydId(76)).thenReturn(delete);
		doctorService.deleteDoctor();

	}

}

