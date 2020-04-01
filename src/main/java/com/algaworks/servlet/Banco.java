package com.algaworks.servlet;

public class Banco {

	public User retornUserADM() {
		return new User("nomeADM", "ADM");
	}

	public User retornUserComum() {
		return new User("nomeComum", "COMUM");
	}

}
