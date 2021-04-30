package com.smlsnnshn.DeveloperReview.oop.abstraction.implementation;

import com.smlsnnshn.DeveloperReview.oop.encapsulation.User;

public interface UserServiceImplementation {

    String userByRoleId(int id);
    User userByFirstName(String firstName);

}
