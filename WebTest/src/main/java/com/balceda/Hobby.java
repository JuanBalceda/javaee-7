package com.balceda;

import java.io.Serializable;

public class Hobby implements Serializable {

    private int id;
    private String desc;

    public Hobby() {
    }

    public Hobby(int id, String desc) {
        this.id = id;
        this.desc = desc;
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
}
