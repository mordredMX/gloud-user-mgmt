package org.quetzalcode.gloud.user.manager;

import org.quetzalcode.gloud.user.entity.User;
import org.quetzalcode.gloud.user.exception.UserException;
import org.quetzalcode.gloud.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserManager {
	
	private UserRepository userRepository;
	
	public UserManager(final @Autowired UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public User createUser(final User user) throws UserException {
		return userRepository.save(user);
	}
}
