package com.Assignment2.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment2.bean.User;
import com.Assignment2.repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository repo;
	
	public User register(User users) {
		return repo.save(users);
	}
	
	public User login(User users) {
		try {
			User login = repo.login(users.getEmail(), users.getPassword());
			return login;
		} catch (Exception e) {
			System.out.println("Credential is null " + e);
		}
		return null;
	}
	
	public String getLastUser() {
		return repo.getLastUser();
	}
	
	public boolean isUserExist(Long id) {
		try {
			repo.findById(id);
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public String checkEmail(String email) {
		return repo.checkEmail(email);
	}
	
	public User updatePassword(String password, String email) {
		Long idUser = Long.parseLong(repo.checkEmail(email).split(",")[0]);
		User user = repo.findById(idUser).get();
		
		// update 
		user.setPassword(password);
		
		// save
		return repo.save(user);
	}
	
	public boolean deleteUserById(Long id) {
		try {
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
