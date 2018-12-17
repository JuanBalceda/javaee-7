package com.balceda.managedbean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
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
    private String zone;
    private String city;
    private String gender;
    private String civilState;
    
    private List<String> zones;
    private List<String> cities;

    public static List<Hobby> hobbies;

    static {
        hobbies = new ArrayList<>();
        hobbies.add(new Hobby(1, "Movies", "movies"));
        hobbies.add(new Hobby(2, "Development", "development"));
        hobbies.add(new Hobby(3, "Sports", "sports"));
        hobbies.add(new Hobby(4, "Reading", "reading"));
    }

    @PostConstruct
    public void init() {
        name = "";
        bornDate = new Date();
        occupation = "";
        hobby = new Hobby();
        zone = "";
        city = "";
        zones = new ArrayList<>();
        cities = new ArrayList<>();
        zones.add("North");
        zones.add("Center");
        zones.add("South");
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

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public List<String> getZones() {
        return zones;
    }

    public void setZones(List<String> zones) {
        this.zones = zones;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public static void setHobbies(List<Hobby> hobbies) {
        UserBean.hobbies = hobbies;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCivilState() {
        return civilState;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState;
    }

}
