package com.example.kafkaPublisher.config;

public class User {
    private int Id;
    private String name;
    private String[] addresses;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    public User(int id, String name, String[] addresses) {
        Id = id;
        this.name = name;
        this.addresses = addresses;
    }

    public User() {
    }
}
