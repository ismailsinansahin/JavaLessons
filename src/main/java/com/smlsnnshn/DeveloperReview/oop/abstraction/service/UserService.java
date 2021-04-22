package com.smlsnnshn.DeveloperReview.oop.abstraction.service;

import com.smlsnnshn.DeveloperReview.enums.Gender;
import com.smlsnnshn.DeveloperReview.oop.abstraction.implementation.UserServiceImplementation;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.Role;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {

    @Override
    public String userByRoleId(int id) {
        User user = new User("Mike", "Smith", new Role(1,"Admin"), Gender.MALE);
        return user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User("Tom", "Ally", new Role(1,"Employee"), Gender.MALE);
        return user;
    }
}
