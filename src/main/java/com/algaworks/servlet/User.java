package com.algaworks.servlet;

public class User {

	private String nome;
	private String senha;
	private String type;

	public User(String string, String string2) {
		nome = string;
		type = string2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
