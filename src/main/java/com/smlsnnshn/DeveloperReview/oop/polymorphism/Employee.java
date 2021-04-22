package com.smlsnnshn.DeveloperReview.oop.polymorphism;

import com.smlsnnshn.DeveloperReview.oop.encapsulation.User;
import com.smlsnnshn.DeveloperReview.oop.inheritance.BaseEntity;

import java.time.LocalDateTime;

public class Employee extends BaseEntity {

    private int employeeId;
    private String employeeTask;
    private User employeeManager;

    public Employee(){};

    public Employee(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime,
                    long lastUpdateUserId) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
    }

    public Employee(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime,
                    long lastUpdateUserId, int employeeId, String employeeTask, User employeeManager) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.employeeId = employeeId;
        this.employeeTask = employeeTask;
        this.employeeManager = employeeManager;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeTask() {
        return employeeTask;
    }

    public void setEmployeeTask(String employeeTask) {
        this.employeeTask = employeeTask;
    }

    public User getEmployeeManager() {
        return employeeManager;
    }

    public void setEmployeeManager(User employeeManager) {
        this.employeeManager = employeeManager;
    }

    public void getEmployeeHours(){
        System.out.println("40 hours a week");
    }


}
