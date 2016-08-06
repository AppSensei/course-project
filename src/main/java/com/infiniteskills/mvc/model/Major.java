package com.infiniteskills.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Major {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer majorId;

	@Column
	private String majorName;
	
	@Column
	private String majorDeptHead;

}
