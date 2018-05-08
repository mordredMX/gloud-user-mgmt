package org.quetzalcode.gloud.user.controller;

import org.quetzalcode.gloud.user.api.CreateUserRequest;
import org.quetzalcode.gloud.user.exception.UserException;
import org.quetzalcode.gloud.user.helper.UserMapper;
import org.quetzalcode.gloud.user.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/user")
public class UserController {
	
	private UserManager userManager;
	
	public UserController(@Autowired final UserManager userManager) {
		this.userManager=userManager;
	}
	
	@RequestMapping(method=RequestMethod.POST,consumes="application/json")
	public void create(final @RequestBody CreateUserRequest createUserRequest) throws UserException {
		userManager.createUser(UserMapper.convertCreateApiToEntity(createUserRequest));
	}
	 

}
