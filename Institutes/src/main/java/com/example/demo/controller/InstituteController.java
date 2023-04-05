package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.InstituteEntity;
import com.example.demo.service.InstituteService;

@Controller
public class InstituteController {
@Autowired
private InstituteService controllerReference;

@PostMapping("abc")

public InstituteEntity savedata(@RequestBody InstituteEntity instituteFields) {
	return controllerReference.savadata(instituteFields);
}
}