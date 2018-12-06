package com.demo.graphql.resolver;

import java.util.Collections;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.graphql.dao.UserRepository;
import com.demo.graphql.dao.model.User;
import com.demo.graphql.dao.model.UserRole;

@Transactional(readOnly = false)
@Component
public class UserMutation implements GraphQLMutationResolver {

	@Autowired
	private UserRepository userRepository;
	
	public User addUser(String firstName, String lastName, String userName, String password, String role) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUsername(userName);
		user.setPassword(password);
		String userId = UUID.randomUUID().toString();
		user.setId(userId);
		
		UserRole userRole = new UserRole();
		userRole.setId(UUID.randomUUID().toString());
		userRole.setUserId(userId);
		userRole.setScope(role);
		
		user.setRole(Collections.singletonList(userRole));

		return userRepository.saveAndFlush(user);
	}
}
