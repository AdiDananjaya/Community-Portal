package com.Assignment2.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long idUser;
	
	@Column(name = "email")
	private String _email;
	
	@Column(name = "password")
	private String _password;
	
	public String getEmail() {
		return _email;
	}
	
	public User() {}
	public User(String email, String password) {
		_email = email;
		_password = password;
	}
	
	public void setEmail(String email) {
		_email = email;
	}
	public String getPassword() {
		return _password;
	}
	public void setPassword(String password) {
		_password = password;
	}
	

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}



	private static boolean _isLogin = false;
	public static void setIsLogin(boolean isLogin) {
		_isLogin = isLogin;
	}
	
	public static boolean isLogin() {
		return _isLogin;
	}
	
	private static boolean _isReset = false;
	public static void setIsReset(boolean isReset) {
		_isReset = isReset;
	}
	
	public static boolean isReset() {
		return _isReset;
	}
}
