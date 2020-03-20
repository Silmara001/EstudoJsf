package com.algaworks.servlet;

import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;

// Activates CDI build-in beans
@FacesConfig(version = JSF_2_3)
@ApplicationScoped
public class Jsf23Activator {
}