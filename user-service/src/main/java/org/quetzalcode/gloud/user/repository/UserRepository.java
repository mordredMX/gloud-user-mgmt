package org.quetzalcode.gloud.user.repository;

import org.quetzalcode.gloud.user.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
