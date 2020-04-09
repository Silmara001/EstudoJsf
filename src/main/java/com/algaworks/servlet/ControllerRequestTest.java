package com.algaworks.servlet;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class ControllerRequestTest implements Serializable {
	private String nome;
	private Date dataNasc;
	private String email;

	private User user;
	private Banco banco;

	@PostConstruct
	public void init() {
		System.out.println("Iniciando controlador - tudo poderá ser carregado aqui");
		banco = new Banco();
	}

	public boolean doAction() {
		System.out.println("Efetuando aplicação dos valores e lendo");
		System.out.println("O nome digitado foi: " + getNome());
		System.out.println("A data de Nasc. digitado foi: " + getDataNasc());
		System.out.println("O email digitado foi: " + getEmail());
		if ("nomeADM".equals(getNome())) {
			setUser(banco.retornUserADM());
		} else if ("nomeComum".equals(getNome())) {
			setUser(banco.retornUserComum());
		} else {
			FacesMessage facesMessage = new FacesMessage("Usuario nao existe");
			FacesContext.getCurrentInstance().addMessage(null, facesMessage);
			return false;
		}
		return true;
	}

	public String goPage2() {
		return doAction() ? "page2.xhtml" : null;
	}

	public String goPage32() {
		if (doAction()) {
			return "page2.xhtml";
		} else {
			return null;
		}
	}
	
	public void changeUserType() {
		if ("ADM".equals(user.getType())) {
			user.setType("COMUM");
		} else {
			user.setType("ADM");
		}
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
