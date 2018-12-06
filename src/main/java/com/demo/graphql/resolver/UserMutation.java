package com.demo.graphql.resolver;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.graphql.dao.UserRepository;
import com.demo.graphql.dao.model.User;

@Component
public class UserMutation implements GraphQLMutationResolver {

	@Autowired
	private UserRepository userRepository;

	public User addUser(String firstName, String lastName, String userName, String password, String role) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUserName(userName);
		user.setPassword(password);
		user.setId(UUID.randomUUID().toString());

		return userRepository.save(user);
	}
}
