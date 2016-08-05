package com.infiniteskills.mvc.model;

import java.io.File;

import javax.persistence.Entity;


public class Student {

	private String name;
	private String enrollementInformation;
	private String guardian;
	private Double tutionCosts;
	private Integer authHours;
	private String description;
	//Add a new image
	private File[] file;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnrollementInformation() {
		return enrollementInformation;
	}
	public void setEnrollementInformation(String enrollementInformation) {
		this.enrollementInformation = enrollementInformation;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public Double getTutionCosts() {
		return tutionCosts;
	}
	public void setTutionCosts(Double tutionCosts) {
		this.tutionCosts = tutionCosts;
	}
	public Integer getAuthHours() {
		return authHours;
	}
	public void setAuthHours(Integer authHours) {
		this.authHours = authHours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
