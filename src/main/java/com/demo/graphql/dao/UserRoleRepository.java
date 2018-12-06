package com.demo.graphql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.graphql.dao.model.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, String> {

}
