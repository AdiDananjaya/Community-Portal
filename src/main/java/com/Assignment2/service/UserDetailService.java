package com.Assignment2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment2.bean.UserDetail;
import com.Assignment2.repository.UserDetailRepository;

@Service
@Transactional
public class UserDetailService {
	@Autowired
	UserDetailRepository repo;
	
	public UserDetail register(UserDetail userDetails) {
		return repo.save(userDetails);
	}
	
	public String getDetailsById(String userId) {
		return repo.getDetailsById(userId);
	}
	
	public UserDetail updateProfile(Long idUserDetail, UserDetail ud) {
		UserDetail userDetails = repo.findById(idUserDetail).get();
		
		// update
		userDetails.set_country(ud.get_country());
		userDetails.set_name(ud.get_name());
		userDetails.set_no_contact(ud.get_no_contact());
		userDetails.set_about(ud.get_about());
		
		// save
 		return repo.save(userDetails);
	}
	
	public List<UserDetail> searchByKey(String key) {
		return repo.searchByKey(key);
	}
	
	public List<UserDetail> getAllUserDetails() {
		return repo.findAll();
	}
	
	public UserDetail getDetailsById(Long id) {
		return repo.findById(id).get();
	}

}
