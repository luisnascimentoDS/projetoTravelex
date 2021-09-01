package com.travelex.exame.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user") 
public class UserEndpoint {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/cliente/{name}")
	public ResponseEntity<?> cliente(@PathVariable(value = "name") String name) throws Exception {
		return new ResponseEntity<User>(userService.criarCliente(name), HttpStatus.OK);
	}
	
	@GetMapping(value = "/gerente/{name}")
	public ResponseEntity<?> gerente(@PathVariable(value = "name") String name) throws Exception {
		return new ResponseEntity<User>(userService.criarGerente(name), HttpStatus.OK);
	}
	
	@GetMapping(value = "/robo/{name}")
	public ResponseEntity<?> robo(@PathVariable(value = "name") String name) throws Exception {
		return new ResponseEntity<User>(userService.criarRobo(name), HttpStatus.OK);
	}

}
