package com.Assignment2.repository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Assignment2.bean.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = "SELECT * FROM user ORDER BY id_user DESC LIMIT 1", nativeQuery = true) 
	String getLastUser();
	
	@Query(value = "SELECT * FROM user WHERE :email = email AND :password = password", nativeQuery = true)
	User login(@Param("email") String email, @Param("password") String password);

	@Query(value = "SELECT * FROM user WHERE email = :email", nativeQuery = true)
	String checkEmail(@Param("email") String email);
}
