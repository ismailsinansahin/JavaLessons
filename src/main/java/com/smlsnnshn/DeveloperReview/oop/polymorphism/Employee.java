package com.smlsnnshn.DeveloperReview.oop.polymorphism;

import com.smlsnnshn.DeveloperReview.oop.encapsulation.User;
import com.smlsnnshn.DeveloperReview.oop.inheritance.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee extends BaseEntity {

    private int employeeId;
    private String employeeTask;
    private User employeeManager;

    public Employee(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime,
                    long lastUpdateUserId, int employeeId, String employeeTask, User employeeManager) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.employeeId = employeeId;
        this.employeeTask = employeeTask;
        this.employeeManager = employeeManager;
    }

    public void getEmployeeHours(){
        System.out.println("40 hours a week");
    }

}
