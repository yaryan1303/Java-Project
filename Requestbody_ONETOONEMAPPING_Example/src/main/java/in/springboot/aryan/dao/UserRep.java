package in.springboot.aryan.dao;

import org.springframework.data.repository.CrudRepository;

import in.springboot.aryan.entity.User;

public interface UserRep extends CrudRepository<User, Integer> {

}
