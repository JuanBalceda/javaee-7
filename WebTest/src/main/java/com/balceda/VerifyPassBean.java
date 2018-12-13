package com.balceda;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class VerifyPassBean implements Serializable {

    private String login;
    private String password;

    @PostConstruct
    public void init() {
        login = "";
        password = "";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void register() {
        System.out.println("Password: " + password);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Register completed"));
    }
}
