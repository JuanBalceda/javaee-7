package com.balceda.controller;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.balceda.managedbean.UserBean;

@ManagedBean
@RequestScoped
public class UserController{

    
    @ManagedProperty(value="#{userBean}")
    private UserBean userBean;


    public void update() {
        System.out.println("Name: " + userBean.getName());
        System.out.println("Birthday: " + userBean.getBornDate());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profile completed"));
    }

    public void updateInfo() {
        System.out.println("Name: " + userBean.getName());
        System.out.println("Ocupation: " + userBean.getOccupation());
        System.out.println("Hobby: " + userBean.getHobby().getDesc());
        System.out.println("Hobby id: " + userBean.getHobby().getId());
        System.out.println("Hobby icon: " + userBean.getHobby().getIcon());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profile updated"));
    }

    public void updateOccupation() {
        System.out.println("Name: " + userBean.getName());
        System.out.println("Ocupation: " + userBean.getOccupation());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profile updated"));
    }

    public void loadCities() {
	userBean.getCities().clear();

        if ("North".equals(userBean.getZone())) {
            userBean.getCities().add("San Francisco");
            userBean.getCities().add("New York");
            userBean.getCities().add("Los Angeles");
        } else if ("Center".equals(userBean.getZone())) {
            userBean.getCities().add("Mexico City");
            userBean.getCities().add("Guatemala");
            userBean.getCities().add("Panama");
        } else if ("South".equals(userBean.getZone())) {
            userBean.getCities().add("Lima");
            userBean.getCities().add("Bogota");
            userBean.getCities().add("Buenos Aires");
        }
    }

    public void updateLocation() {
        System.out.println("Name: " + userBean.getName());
        System.out.println("Zone: " + userBean.getZone());
        System.out.println("City: " + userBean.getCity());

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profile updated"));
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }
    
    
}
