package com.Assignment2.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "experiences")
public class Experiences {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_experience")
	private Long idExperience;
	
	@Column(name = "id_user_detail")
	private String idUserDetail;
	
	@OneToOne(optional=false)
	@JoinColumn(name = "id_user_detail", referencedColumnName = "id_user_detail", insertable=false, updatable=false)
	private UserDetail userDetail;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "end_date")
	private String endDate;

	public Long getExperienceId() {
		return idExperience;
	}

	public void setExperienceId(Long idExperience) {
		this.idExperience = idExperience;
	}

	public String getUserDetailsId() {
		return idUserDetail;
	}

	public void setUserDetailsId(String userDetailsId) {
		this.idUserDetail = userDetailsId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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
