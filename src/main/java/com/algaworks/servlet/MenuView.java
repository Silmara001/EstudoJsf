package com.algaworks.servlet;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@Named
@RequestScoped
public class MenuView {
    private MenuModel model;
 
    @PostConstruct
    public void init() {
        model = new DefaultMenuModel();
 
        //First submenu
        DefaultSubMenu menu = DefaultSubMenu.builder()
        		.label("Dynamic Menu")
                .build();
 
        DefaultMenuItem item = DefaultMenuItem.builder()
                .value("Atualizar")
                .url("#")
                //.rendered(false)
                .icon("pi pi-refresh")
                .build();
        menu.getElements().add(item);
 
        item = DefaultMenuItem.builder()
                .value("Agenda")
                .url("#")
                .icon("pi pi-calendar")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Novo")
                .url("#")
                .icon("pi pi-plus-circle")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Alocações")
                .url("#")
                .icon("pi pi-th-large")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Gestão")
                .url("#")
                .icon("pi pi-sitemap")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Planejamento")
                .url("#")
                .icon("pi pi-list")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Importação")
                .url("#")
                .icon("pi pi-upload")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Demandas")
                .url("#")
                .icon("pi pi-file")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Reembolso")
                .url("#")
                .icon("pi pi-ticket")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Aprovações")
                .url("#")
                .icon("pi pi-check-circle")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Relatórios")
                .url("#")
                .icon("pi pi-cahrt-bar")
                .build();
        menu.getElements().add(item);
        
        item = DefaultMenuItem.builder()
                .value("Sair")
                .url("#")
                .icon("pi pi-sign-out")
                .build();
        menu.getElements().add(item);
        
        model.getElements().add(menu); 
    }
 
    public MenuModel getModel() {
        return model;
    }
 
    public void save() {
        addMessage("Success", "Data saved");
    }
 
    public void update() {
        addMessage("Success", "Data updated");
    }
 
    public void delete() {
        addMessage("Success", "Data deleted");
    }
 
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}