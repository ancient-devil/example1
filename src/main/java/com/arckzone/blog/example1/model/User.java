package com.arckzone.blog.example1.model;

import javax.annotation.processing.Generated;

@Generated("https://blog.arckzone.com")
public class User {

    private Gender gender;
    private Career career;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private String address;
    private int age;

    public User() {
    }

    public User(Gender gender, Career career, String firstname, String lastname, String email, String phoneNumber, String address, int age) {
        this.gender = gender;
        this.career = career;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "User: { gender=%s, career=%s, firstname=%s, lastname=%s, email=%s, phoneNumber=%s, address=%s, age=%d }",
                gender,
                career.getTitle(),
                firstname,
                lastname,
                email,
                phoneNumber,
                address,
                age
        );
    }
}
