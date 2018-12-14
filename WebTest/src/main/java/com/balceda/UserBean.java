package com.balceda;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@ViewScoped
public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private Date bornDate;
    private String occupation;
    private Hobby hobby;

    public static List<Hobby> hobbies;

    static {
        hobbies = new ArrayList<>();
        hobbies.add(new Hobby(1, "Gamer"));
        hobbies.add(new Hobby(2, "Developer"));
        hobbies.add(new Hobby(3, "Designer"));
        hobbies.add(new Hobby(4, "Runner"));
        hobbies.add(new Hobby(5, "Skater"));
    }

    @PostConstruct
    public void init() {
        name = "";
        bornDate = new Date();
        occupation = "";
        hobby = new Hobby();
    }


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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public void update() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + bornDate);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profile completed"));
    }

    public void updateInfo() {
        System.out.println("Name: " + name);
        System.out.println("Hobby: " + hobby.getDesc());
        System.out.println("Hobby: " + hobby.getId());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Profile updated"));
    }


}
