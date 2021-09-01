package com.travelex.exame.user;

public interface UserService {

	User criarCliente(String name) throws Exception;
	User criarGerente(String name) throws Exception;
	User criarRobo(String name) throws Exception;
}
