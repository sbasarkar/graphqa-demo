package com.demo.graphql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.graphql.dao.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
