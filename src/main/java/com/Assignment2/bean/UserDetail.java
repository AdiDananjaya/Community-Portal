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
@Table(name = "user_detail")
public class UserDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user_detail")
	private Long idUserDetail;
	
	@Column(name = "id_user")
	private String idUser;
	
	@OneToOne(optional=false)
	@JoinColumn(name = "id_user", referencedColumnName = "id_user", insertable=false, updatable=false)
	private User users;
	
	@Column(name = "name")
	private String _name;
	
	@Column(name = "no_contact")
	private Integer _no_contact;
	
	@Column(name = "about")
	private String _about;
	
	@Column(name = "id_country")
	private String _country;
	
	public UserDetail() {}
	
	public UserDetail(Long idUserDetail, String idUser, User users, String _country, String name,
			Integer no_contact, String about) {
		this.idUserDetail = idUserDetail;
		this.idUser = idUser;
		this.users = users;
		this._country = _country;
		this._name = name;
		this._about = about;
	}

	public Long getIdUserDetail() {
		return idUserDetail;
	}

	public void setIdUserDetail(Long idUserDetail) {
		this.idUserDetail = idUserDetail;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Integer get_no_contact() {
		return _no_contact;
	}

	public void set_no_contact(Integer _no_contact) {
		this._no_contact = _no_contact;
	}

	public String get_about() {
		return _about;
	}

	public void set_about(String _about) {
		this._about = _about;
	}

	public String get_country() {
		return _country;
	}

	public void set_country(String _country) {
		this._country = _country;
	}
	
	
}
