package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.InstituteEntity;
import com.example.demo.repository.InstituteRepository;

@Service
public class InstituteService {
	@Autowired
private InstituteRepository reference;
public InstituteEntity savadata(InstituteEntity instituteFields) {
	return reference.save(instituteFields);
}
//private StudentRepository studentRepository;
//
//
//public Student saveData(Student student) {
//	return studentRepository.save(student);
//	
//}
	
}
