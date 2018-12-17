package com.balceda.managedbean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created by jbalceda on Dec, 2018
 */
@ManagedBean
@ViewScoped
public class StudentBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    @PostConstruct
    public void init(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void register(){
        System.out.println("Name: "+name);
    }
}
