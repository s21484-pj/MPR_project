package com.s21484.project.models;

public class CustomerModel {

    private final int id;
    private final String name;
    private final String lastName;
    private final String phoneNumber;
    private final String email;
    private final String address;

    public CustomerModel(int id, String name, String lastName, String phoneNumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public int getId() { return this.id; }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
