package com.balceda.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.balceda.managedbean.VerifyPassBean;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class VerifyPassController {


    @ManagedProperty("#{verifyPassBean}")
    private VerifyPassBean verifyPassBean;

    public void register() {
	System.out.println("Password: " + verifyPassBean.getPassword());
	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Register completed"));
    }

    public void updateProfile() {
	System.out.println("Name: " + verifyPassBean.getName());
	System.out.println("About: " + verifyPassBean.getAbout());
	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profile completed"));
    }

    public List<String> autocompleteOptions(String text) {
	List<String> list = new ArrayList<>();

	// Works with at least 3 characters
	if (text.startsWith("joa")) {
	    list.add("Joan");
	    list.add("Joana");
	    list.add("Joa");
	    list.add("Joane");
	    list.add("Joaquin");
	}
	return list;
    }

    public VerifyPassBean getVerifyPassBean() {
        return verifyPassBean;
    }

    public void setVerifyPassBean(VerifyPassBean verifyPassBean) {
        this.verifyPassBean = verifyPassBean;
    }
    
    
}
