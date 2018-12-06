package com.demo.graphql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.demo.graphql.dao.UserRoleRepository;
import com.demo.graphql.dao.model.User;
import com.demo.graphql.dao.model.UserRole;
@Component
public class UserResolver implements GraphQLResolver<User>{
	
	@Autowired
	private UserRoleRepository repo;
	
	public UserResolver(UserRoleRepository repo) {
		this.repo =  repo;
	}
	
	public List<UserRole> getRole(User user) {
		return repo.findByUser(user.getId());
	}

}
