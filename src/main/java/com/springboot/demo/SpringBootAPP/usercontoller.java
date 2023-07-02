package com.springboot.demo.SpringBootAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontoller {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/hello world")
	public String sayHelloWorld() {
	return "Hello World from sprint boot";
	}
	
//	@GetMapping("/createStudent")
	@PostMapping("/createStudent")
	public String registerStudent(@RequestBody Student student)
	
//	public String registerStudent()
	{
		
//		Student student = new Student (98, "Jyoti", "9999999999" , 23);
		Student savedStudent = studentService.createStudent(student);
		if(savedStudent!=null) {
			return "Student has been successfully registered";
		}
		else {
			return "some error occured, Please connect with the tem to know more";
		}
	}
	@GetMapping("/getStudent/{rollnumber}") 
	public Student getStudent(@PathVariable(value="rollnumber") int rollnumber) {
		Student student = studentService.getStudent(rollnumber);
		return student;
	}
}
