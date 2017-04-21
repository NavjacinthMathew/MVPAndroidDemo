package com.navjacinthmathew.mvpdemo.model;

/**
 * Created by Navjacinth Mathew on 4/19/2017.
 */

public class EmployeeModel {
    private int id;
    private String name;
    private String emailId;

    public EmployeeModel(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
