package com.infiniteskills.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MediaType")
public class MediaType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MediaTypeId")
	private Integer mediaTypeId;
	
	@Column(name="Name")
	private String name;

	public Integer getMediaTypeId() {
		return mediaTypeId;
	}

	public void setMediaTypeId(Integer mediaTypeId) {
		this.mediaTypeId = mediaTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
