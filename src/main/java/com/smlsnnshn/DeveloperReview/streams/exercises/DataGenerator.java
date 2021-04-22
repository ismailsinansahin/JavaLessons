package com.smlsnnshn.DeveloperReview.streams.exercises;

import com.smlsnnshn.DeveloperReview.enums.Gender;
import com.smlsnnshn.DeveloperReview.enums.Status;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.Role;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.User;
import com.smlsnnshn.DeveloperReview.oop.inheritance.Project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static Role adminRole = new Role(1, "Admin");
    public static Role managerRole = new Role(2, "Manager");
    public static Role employeeRole = new Role(3, "Employee");
    public static Role supervisorRole = new Role(5,"Supervisor");
    public static Role ceoRole = new Role(6,"Chief Executive Officer");
    public static Role cfoRole = new Role(7,"Chief Financial Officer");
    public static Role cmoRole = new Role(8,"Chief Marketing Officer");

    public static User manager1 = new User(2, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Delisa",
            "Norre", managerRole, Gender.FEMALE);
    public static User manager2 = new User(3, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Craig",
            "Jark", managerRole, Gender.MALE);
    public static User manager3 = new User(4,LocalDateTime.now(),1,LocalDateTime.now().plusHours(2),1,"William",
            "Houston",managerRole,Gender.MALE);
    public static User manager4 = new User(5,LocalDateTime.now(),1,LocalDateTime.now().plusHours(2),1,"Charles",
            "Kane",managerRole,Gender.MALE);
    public static User manager5 = new User(6,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Tracy",
            "Wilson",managerRole,Gender.FEMALE);

    public static Project project1 = new Project(1, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1,
            "PRJ001", "Human Resource CRM", manager1, LocalDate.now(), LocalDate.now().plusDays(6), Status.IN_PROGRESS,
            "HCRM Detail Information");
    public static Project project2 = new Project(2, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1,
            "PRJ002", "Infra Upgrade", manager2, LocalDate.now(), LocalDate.now().plusDays(3), Status.UAT_TEST,
            "Server Details");
    public static Project project3 = new Project(3, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1,
            "PRJ003", "Customer Service", manager3, LocalDate.now(), LocalDate.now().plusDays(5), Status.IN_PROGRESS,
            "Customer Service Detail");
    public static Project project4 = new Project(4, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(2), 1,
            "PRJ004", "Ticketing Application", manager4, LocalDate.now(), LocalDate.now().plusDays(2), Status.UAT_TEST,
            "Seperate the role and task projacts");
    public static Project project5 = new Project(5, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1,
            "PRJ005", "E commerce", manager1, LocalDate.now(), LocalDate.now().plusDays(10), Status.OPEN,"Shopping");

    public static User user1 = new User(1,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Sarah",
            "Brown",supervisorRole,Gender.FEMALE);
    public static User user2 = new User(1,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Isabella",
            "Jones",ceoRole,Gender.FEMALE);
    public static User user3 = new User(2,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Richard",
            "Byrne",ceoRole,Gender.MALE);
    public static User user4 = new User(1,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Joseph",
            "Evans",cfoRole,Gender.MALE);
    public static User user5 = new User(1,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Barbara",
            "Martin",cmoRole,Gender.FEMALE);
    public static User user6 = new User(6,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Tracy",
            "Wilson",managerRole,Gender.FEMALE);
    public static User user7 = new User(7, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Shaun",
            "Hayns",employeeRole, Gender.MALE);
    public static User user8 = new User(8, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Mike",
            "Lugan",employeeRole, Gender.MALE);
    public static User user9 = new User(9, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Daniel",
            "Smith",employeeRole, Gender.MALE);
    public static User user10 = new User(10, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Ellie",
            "Smith",employeeRole, Gender.FEMALE);
    public static User user11 = new User(11, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Emma",
            "Jones",employeeRole, Gender.FEMALE);
    public static User user12 = new User(12,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Sarah",
            "Brown",supervisorRole,Gender.FEMALE);
    public static User user13 = new User(1,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Isabella",
            "Jones",ceoRole,Gender.FEMALE);
    public static User user14 = new User(2,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Richard",
            "Byrne",ceoRole,Gender.MALE);
    public static User user15 = new User(1,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Joseph",
            "Evans",cfoRole,Gender.MALE);
    public static User user16 = new User(1,LocalDateTime.now(),1,LocalDateTime.now().plusHours(1),1,"Barbara",
            "Martin",cmoRole,Gender.FEMALE);

    public static List<Role> getRoles() {
        List<Role> roles = new ArrayList<>();
        roles.add(employeeRole);
        roles.add(managerRole);
        roles.add(adminRole);
        roles.add(supervisorRole);
        roles.add(ceoRole);
        roles.add(cfoRole);
        roles.add(cmoRole);
        return roles;
    }

    public static List<User> getUsers() {
        List<User> users = new ArrayList<>(50);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        users.add(user11);
        users.add(user12);
        users.add(user13);
        users.add(user14);
        users.add(user15);
        users.add(user16);
        return users;
    }

    public static List<Project> getProjects() {
        List<Project> projects = new ArrayList<>();
        projects.add(project1);
        projects.add(project2);
        projects.add(project3);
        projects.add(project4);
        projects.add(project5);
        return projects;
    }

    public static List<User> getManagers() {
        List<User> managers = new ArrayList<>();
        managers.add(manager1);
        managers.add(manager2);
        managers.add(manager3);
        managers.add(manager4);
        managers.add(manager5);
        return managers;
    }

}
