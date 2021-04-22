package com.smlsnnshn.DeveloperReview.collections;

import com.smlsnnshn.DeveloperReview.enums.Gender;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.Role;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void createList(){

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(20);

        for(Integer each : list){
            System.out.println(each);
        }

    }

    public static void createUserList(){

        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike", "Smith", new Role(1, "Manager"), Gender.MALE));
        userList.add(new User("Ammy", "Taylor", new Role(1, "Admin"), Gender.FEMALE));

        for(User each : userList){
            System.out.println(each.getRole().getDescription());
        }

    }

    public static List<Role> createRoleList(){

        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1, "Manager"));
        roleList.add(new Role(2, "Employee"));
        roleList.add(new Role(3, "Admin"));
        roleList.add(new Role(4, "Employee"));
        roleList.add(new Role(5, "Employee"));
        return roleList;

    }

}
