package com.Assignment2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Assignment2.bean.UserDetail;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {
	@Query(value = "SELECT id_user_detail, name, no_contact, about FROM user_detail"
			+ " JOIN user ON user_detail.id_user = user.id_user"
			+ " WHERE user.id_user = :idUser", nativeQuery = true)
	public String getDetailsById(@Param("idUser") String idUser);
	
	@Query(value = "SELECT * FROM user_detail"
	 		+ " WHERE name LIKE %:key%"
	 		+ " OR about LIKE %:key%", nativeQuery = true)
	public List<UserDetail> searchByKey(@Param("key") String key);
}
