package com.wesley.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wesley.lojavirtual.model.User;
import com.wesley.lojavirtual.repository.UserRepository;



@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/user")
public class UserController {

	
	//Aqui vc pode trocar pela serviceImpl
	private UserRepository userRepository;
	

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<User> saveBaralho(@RequestBody User user, BindingResult bindingResult){
		if(bindingResult.hasErrors() || (user.getId() == null) || (user.getNikename() == null) || (user.getRegistration() == null)|| (user.getDate()== null)) {
			return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
		}
		// aqui para service vc usar o save(nome da class)
		return new ResponseEntity<User>(userRepository.save(user), HttpStatus.CREATED);
	}
}
