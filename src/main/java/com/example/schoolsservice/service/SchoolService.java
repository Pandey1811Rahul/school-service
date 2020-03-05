package com.example.schoolsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.schoolsservice.model.Students;

@Service
public class SchoolService {

	@Autowired
	RestTemplate restTemplate; 
	@Autowired
	DiscoveryClient client;
	public Students getAllStudents(){
		System.out.println(client.getInstances("STUDENT-SERVICE"));
	Students students	= restTemplate.getForObject("http://STUDENT-SERVICE/student/get-students", Students.class);
	return students;
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
}
