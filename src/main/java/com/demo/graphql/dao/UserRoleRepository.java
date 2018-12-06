package com.demo.graphql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.graphql.dao.model.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, String> {
	
	@Query("From UserRole where userId = :userId")
	List<UserRole> findByUser(@Param("userId") String userId); 
}
