package com.Assignment2.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_country")
	private Long idCountry;
	
	@Column(name = "country_name")
	private String countryName;

	public country() {};
	public country(Long idCountry, String countryName) {
		this.idCountry = idCountry;
		this.countryName = countryName;
	}
}
