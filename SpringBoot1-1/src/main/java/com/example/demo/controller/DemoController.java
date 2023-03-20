package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.EnrollmentModel;
import com.example.demo.Repository.EnrollmentRepository;

@RestController
public class DemoController {
	@Autowired
	  EnrollmentRepository emprep;
    @PostMapping("addEnrollment/")
    public ResponseEntity<EnrollmentModel> addEnrollment(@RequestBody EnrollmentModel enr) {
    return new ResponseEntity<EnrollmentModel>(emprep.save(enr),HttpStatus.CREATED);
    }
	@RequestMapping("demo")
	public List<EnrollmentModel> getName() {
		return emprep.findAll();
	}

}
