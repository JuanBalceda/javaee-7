package com.balceda;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Date;

@ManagedBean
@ViewScoped
public class UserBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Date bornDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public void update(){
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + bornDate);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profile completed"));
    }

}
