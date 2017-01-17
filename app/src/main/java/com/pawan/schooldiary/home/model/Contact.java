package com.pawan.schooldiary.home.model;

/**
 * Created by pawan on 17/1/17.
 */

public class Contact {
    private String name;
    private String email;
    private String imgUrl;

    public Contact() {
    }

    public Contact(String name, String email, String imgUrl) {
        this.name = name;
        this.email = email;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
