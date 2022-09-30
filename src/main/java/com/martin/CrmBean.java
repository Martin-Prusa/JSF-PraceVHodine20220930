package com.martin;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named("crm")
@ApplicationScoped
public class CrmBean {
    private List<User> users = new ArrayList<>();
    private User newUser = new User();

    public void deleteUser(int i) {
        System.out.println(i);
        this.users.remove(i);
    }

    public void submitNewUser() {
        this.users.add(newUser);
        this.newUser = new User();
    }

    public List<User> getUsers() {
        return users;
    }

    public User getNewUser() {
        return newUser;
    }
}
