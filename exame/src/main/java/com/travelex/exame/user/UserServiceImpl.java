package com.travelex.exame.user;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Override
	public User criarCliente(String name) throws Exception {
		
		if(checkName(name)) {
			User user = new Cliente(name);
			return user;
		} else {
			throw new Exception("Favor, informar um nome válido");
		}
		
	}

	@Override
	public User criarGerente(String name) throws Exception {
		if(checkName(name)) {
			User user = new Gerente(name);
			return user;
		} else {
			throw new Exception("Favor, informar um nome válido");
		}
		
	}

	@Override
	public User criarRobo(String name) throws Exception {
		if(checkName(name)) {
			User user = new Robo(name);
			return user;
		} else {
			throw new Exception("Favor, informar um nome válido");
		}
		
	}
	
	
	private Boolean checkName(String name) {
		return name != null && !name.equals("") && !name.equals(" ");
	}

}
