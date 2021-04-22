package com.smlsnnshn.DeveloperReview;

import com.smlsnnshn.DeveloperReview.core.Loops;
import com.smlsnnshn.DeveloperReview.core.Methods;
import com.smlsnnshn.DeveloperReview.core.SelectionStatements;
import com.smlsnnshn.DeveloperReview.enums.Gender;
import com.smlsnnshn.DeveloperReview.enums.Status;
import com.smlsnnshn.DeveloperReview.oop.abstraction.implementation.UserServiceImplementation;
import com.smlsnnshn.DeveloperReview.oop.abstraction.service.UserService;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.Role;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.User;
import com.smlsnnshn.DeveloperReview.oop.inheritance.BaseEntity;
import com.smlsnnshn.DeveloperReview.oop.inheritance.Project;
import com.smlsnnshn.DeveloperReview.oop.polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        System.out.println("****************METHODS****************");
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(8));
        Methods.methodC();

        System.out.println("****************LOOPS****************");
        Loops.demoForIterator();
        Loops.demoForEach();

        System.out.println("****************SELECTION STATEMENTS****************");
        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();

        System.out.println("****************OOP ENCAPSULATION****************");
        User user1 = new User("Ismail", "Sahin", new Role(2, "Manager"), Gender.MALE);
        System.out.println(user1.getFirstName());
        System.out.println(user1.getLastName());
        System.out.println(user1.getRole().getId());
        System.out.println(user1.getRole().getDescription());

        System.out.println("****************OOP INHERITANCE****************");
        Project project = new Project(1, LocalDateTime.now(),1,LocalDateTime.now().minusHours(5),
                1, "PRJ001","Human Resource CRM",
                new User("Mike", "Smith", new Role(1,"Manager"),Gender.MALE),
                LocalDate.now(), LocalDate.now().plusMonths(6), Status.IN_PROGRESS,
                "HCRM Detail Information");
        System.out.println(project.toString());

        System.out.println("****************OOP INTERFACE****************");
        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());

        System.out.println("****************OOP POLYMORPHISM****************");
        Employee employee1 = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplementation userServiceImplementation = new UserService();

        employee1.getEmployeeHours();
        //employee2.getEmployeeHours();  //because BaseEntity class doesn't have getEmployeeHours() method
        ((Employee)employee2).getEmployeeHours(); //down casting

        System.out.println("****************ENUM****************");
        System.out.println(Gender.FEMALE); //giving object
        System.out.println(Status.IN_PROGRESS.getValue()); //giving String

    }

}
