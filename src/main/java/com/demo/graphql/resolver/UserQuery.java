package com.demo.graphql.resolver;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.graphql.dao.UserRepository;
import com.demo.graphql.dao.UserRoleRepository;
import com.demo.graphql.dao.model.User;
import com.demo.graphql.dao.model.UserRole;

@Component
public class UserQuery implements GraphQLQueryResolver {

	@Autowired
	private UserRoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	public Iterable<User> findAllUsers() {
		return userRepository.findAll();
	}

	public User findUser(String id) {
		return userRepository.getOne(id);
	}

	public Iterable<UserRole> findUserRole(String id) {
		return roleRepository.findAllById(Collections.singletonList(id));
	}

}
