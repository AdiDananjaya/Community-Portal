package com.Assignment2.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "educations")
public class Educations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "education_id")
	private Long educationId;
	
	@Column(name = "id_user_detail")
	private String idUserDetail;
	
	@Column(name = "intitution_name")
	private String intitutionName;
	
	@Column(name = "education_name")
	private String educationName;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "end_date")
	private String endDate;

	public Long getEducationId() {
		return educationId;
	}

	public void setEducationId(Long educationId) {
		this.educationId = educationId;
	}

	public String getUserDetailsId() {
		return idUserDetail;
	}

	public void setUserDetailsId(String idUserDetail) {
		this.idUserDetail = idUserDetail;
	}

	public String getIntitutionName() {
		return intitutionName;
	}

	public void setIntitutionName(String intitutionName) {
		this.intitutionName = intitutionName;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
