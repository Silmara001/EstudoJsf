package com.algaworks.servlet;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ControllerTest implements Serializable {
	private String nome;
	private Date dataNasc;
	private String email;
	
	@PostConstruct
	public void init() {
		System.out.println("Iniciando controlador - tudo poderá ser carregado aqui");
	}

	public void doAction() {
		System.out.println("Efetuando aplicação dos valores e lendo");
		System.out.println("O nome digitado foi: " + getNome());
		System.out.println("A data de Nasc. digitado foi: " + getDataNasc());
		System.out.println("O email digitado foi: " + getEmail());
		
	}
	
	public String goPage2() {
		doAction();
		return "page2.xhtml";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
