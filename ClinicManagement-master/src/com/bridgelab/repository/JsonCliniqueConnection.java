package com.bridgelab.repository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelab.model.Doctor;
import com.bridgelab.model.Patient;

public class JsonCliniqueConnection {
	static ObjectMapper mapper = new ObjectMapper();

	public void writePatientList(List<Patient> listofpatient) {

		try {

			mapper.writeValue(new FileOutputStream("Patients.json"), listofpatient);
		} catch (Exception e) {
			System.out.println("File Not Found");
		}
	}

	public List<Patient> readPatientList() {
		List<Patient> list = null;
		try {

			list = mapper.readValue(new FileInputStream("Patients.json"), new TypeReference<List<Patient>>() {
			});
		} catch (Exception e) {
			System.out.println("File Not Found");
		}
		return list;

	}

	public void writeDoctorList(List<Doctor> listofdoctors) {

		try {

			mapper.writeValue(new FileOutputStream("Doctors.json"), listofdoctors);
		} catch (Exception e) {
			System.out.println("File Not Found");
		}
	}

	public List<Doctor> readDoctorList() {
		List<Doctor> list = null;
		try {

			list = mapper.readValue(new FileInputStream("Doctors.json"), new TypeReference<List<Doctor>>() {
			});
		} catch (Exception e) {
			System.out.println("File Not Found");
		}
		return list;
	}

}
