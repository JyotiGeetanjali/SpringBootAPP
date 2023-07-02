package com.springboot.demo.SpringBootAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
	
	@Autowired
	StudentRepository studentRespository;
	
	
public boolean validateLogin(String Username, String password) {
	
	return false;
}

public Student createStudent (Student student) {
	Student savedStudent = studentRespository.save(student);
	return savedStudent;

	
	
}	
public Student getStudent(int rollnumber) {
	Student student = studentRespository.findById(rollnumber).get();
	return student;


}
}
	

