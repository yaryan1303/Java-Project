package in.springboot.aryan.dao;

import org.springframework.data.repository.CrudRepository;

import in.springboot.aryan.entity.Address;

public interface AddressRepo extends CrudRepository<Address, Integer> {

}
