package com.infiniteskills.mvc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Album {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="")
	private String enrollementInformation;
	
	@Column(name="")
	private String guardian;
	
	@Column(name="")
	private Double tutionCosts;
	
	@Column(name="")
	private Integer authHours;
	
	@Column(name="")
	private String description;
	
	//Add a new image
	@Column(name="")
	private byte[] photo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Major major;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
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
