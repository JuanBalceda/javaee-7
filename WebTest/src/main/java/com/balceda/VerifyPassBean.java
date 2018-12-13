package com.balceda;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class VerifyPassBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String login;
    private String password;
    private String name;
    private String about;

    @PostConstruct
    public void init() {
        login = "";
        password = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
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

    public void updateProfile() {
        System.out.println("Name: " + name);
        System.out.println("About: " + about);
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
}
