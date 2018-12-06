package com.demo.graphql.resolver;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.graphql.dao.UserRoleRepository;
import com.demo.graphql.dao.model.UserRole;

@Component
public class UserRoleMutation implements GraphQLMutationResolver {

	@Autowired
	private UserRoleRepository userRoleRepository;

	public UserRole addUserRole(String userId, String scope) {
		UserRole role = new UserRole();
		role.setId(UUID.randomUUID().toString());
		role.setUserId(userId);
		role.setScope(scope);
		return userRoleRepository.save(role);
	}
}
