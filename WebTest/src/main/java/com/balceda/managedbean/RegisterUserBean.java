package com.balceda.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by jbalceda on Dec, 2018
 */
@ManagedBean
@ViewScoped
public class RegisterUserBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String login;
    private String name;

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

}