package com.example.homepage;

public class  Helperclass {


    String email, username, password,number,bloodgroup,location;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Helperclass(String email, String username, String password,String location,String number,String bloodgroup) {

        this.email = email;
        this.username = username;
        this.password = password;
        this.location = location;
        this.number = number;
        this.bloodgroup = bloodgroup;
    }

    public Helperclass() {
    }
}
