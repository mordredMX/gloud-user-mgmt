package org.quetzalcode.gloud.user.helper;

import org.quetzalcode.gloud.user.api.CreateUserRequest;
import org.quetzalcode.gloud.user.entity.User;

public final class UserMapper {
	private UserMapper() {
		
	}
	
	public static User convertCreateApiToEntity(final CreateUserRequest api) {
		User entity=new User(api.getUsername(),api.getPassword(),api.getFirstName(),api.getLastName());
		return entity;
	}
	
}
