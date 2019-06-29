package id.co.tutorial.sandbox.springbootsample.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import id.co.tutorial.sandbox.springbootsample.controller.mapper.UserModuleWrapper;
import id.co.tutorial.sandbox.springbootsample.entity.User;
import id.co.tutorial.sandbox.springbootsample.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/{userId}")
	private UserModuleWrapper getUserModule (@PathVariable(value = "userId") Long userId) {
		Optional<User> userOp = this.userRepository.findById(userId) ;
		User user = userOp.get();
		UserModuleWrapper resp = new UserModuleWrapper(user);
		return resp;
	}

}
