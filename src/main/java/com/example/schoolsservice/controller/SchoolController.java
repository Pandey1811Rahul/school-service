package com.example.schoolsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.schoolsservice.model.Students;
import com.example.schoolsservice.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	private SchoolService service;
	
	@GetMapping("/getSchoolDetails")
	public ResponseEntity<String>   getSchool(){
		return new ResponseEntity<String>("school - service called", HttpStatus.OK);
	}  
	
	
	@GetMapping("/get-all-sutudent-from-school")
	public ResponseEntity<Students>   getAllStundents(){
		Students students = service.getAllStudents();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}   
	
}
