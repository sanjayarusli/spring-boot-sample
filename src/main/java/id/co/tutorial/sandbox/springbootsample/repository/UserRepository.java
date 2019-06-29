package id.co.tutorial.sandbox.springbootsample.repository;

import org.springframework.data.repository.CrudRepository;

import id.co.tutorial.sandbox.springbootsample.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
