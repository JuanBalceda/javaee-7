package com.balceda.controller;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.balceda.managedbean.RegisterUserBean;

/**
 * Created by jbalceda on Dec, 2018
 */
@ManagedBean
@RequestScoped
public class RegisterUserController {

    @ManagedProperty("#{registerUserBean}")
    private RegisterUserBean registerUserBean;

    public void verifyAvailability() {
	FacesMessage msg = null;
	System.out.println("Verifying availability for: " + registerUserBean.getLogin());
	try {
	    Thread.sleep(5000);
	} catch (InterruptedException e) {
	    System.out.println("Error at verifyAvailability(): " + e);
	}

	if (registerUserBean.getLogin().equalsIgnoreCase("jbalceda")) {
	    msg = new FacesMessage("Login not available");
	    msg.setSeverity(FacesMessage.SEVERITY_WARN);
	} else {
	    msg = new FacesMessage("Login available");
	}
	FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void register() {
	System.out.println("Login: " + registerUserBean.getLogin());
	System.out.println("Name: " + registerUserBean.getName());
	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration process completed."));
    }

    public RegisterUserBean getRegisterUserBean() {
        return registerUserBean;
    }

    public void setRegisterUserBean(RegisterUserBean registerUserBean) {
        this.registerUserBean = registerUserBean;
    }
    
    
}