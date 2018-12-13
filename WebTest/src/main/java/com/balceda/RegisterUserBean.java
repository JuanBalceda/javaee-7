package com.balceda;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 * Created by jbalceda on Dec, 2018
 */
@ManagedBean
@ViewScoped
public class RegisterUserBean implements Serializable{

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

    public void verifyAvailability(){
        FacesMessage msg = null;
        System.out.println("Verifying availability for: "+this.login);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            //TODO: handle exception
        }

        if(login.equalsIgnoreCase("jbalceda")){
            msg = new FacesMessage("Login not available");
            msg.setSeverity(FacesMessage.SEVERITY_WARN);
        }else{
            msg = new FacesMessage("Login available");
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void register(){
        System.out.println("Login: "+this.login);
        System.out.println("Name: "+this.name);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registration process completed."));
    }
}