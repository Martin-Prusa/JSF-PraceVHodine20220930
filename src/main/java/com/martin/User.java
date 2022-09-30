package com.martin;

public class User {
    private String name;
    private String lastname;
    private int age;
    private boolean isLongTime;

    public User() {
        this.name = "";
        this.lastname = "";
        this.age = 0;
        this.isLongTime = false;
    }

    public User(String name, String lastname, int age, boolean isLongTime) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.isLongTime = isLongTime;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isLongTime() {
        return isLongTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLongTime(boolean longTime) {
        isLongTime = longTime;
    }
}
