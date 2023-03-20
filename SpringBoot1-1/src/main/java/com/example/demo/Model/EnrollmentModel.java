package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EnrollmentModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int stdid;
	 private String stdName;
	 private String stdDept;
	public int getStdid() {
		return stdid;
	}
	public EnrollmentModel() {
		
	}
	public EnrollmentModel(String stdName, String stdDept) {
		super();
		//this.stdid = stdid;
		this.stdName = stdName;
		this.stdDept = stdDept;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdDept() {
		return stdDept;
	}
	public void setStdDept(String stdDept) {
		this.stdDept = stdDept;
	}

}
