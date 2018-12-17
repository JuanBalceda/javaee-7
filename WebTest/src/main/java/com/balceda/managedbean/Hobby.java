package com.balceda.managedbean;

import java.io.Serializable;

public class Hobby implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String desc;
    private String icon;

    public Hobby() {
    }

    public Hobby(int id, String desc, String icon) {
	this.id = id;
	this.desc = desc;
	this.icon = icon;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getDesc() {
	return desc;
    }

    public void setDesc(String desc) {
	this.desc = desc;
    }

    public String getIcon() {
	return icon;
    }

    public void setIcon(String icon) {
	this.icon = icon;
    }
}
