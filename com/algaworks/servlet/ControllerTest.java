package com.algaworks.servlet;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ControllerTest implements Serializable {
	private String nome;
	
	@PostConstruct
	public void init() {
		System.out.println("Iniciando controlador - tudo poderá ser carregado aqui");
	}

	public void doAction() {
		System.out.println("Efetuando aplicação dos valores e lendo");
		System.out.println("O nome digitado foi: " + getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
