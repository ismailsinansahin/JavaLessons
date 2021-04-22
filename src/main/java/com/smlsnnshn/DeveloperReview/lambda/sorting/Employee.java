package com.smlsnnshn.DeveloperReview.lambda.sorting;

import com.smlsnnshn.DeveloperReview.oop.encapsulation.Role;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private Integer employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeCity;
    private Role role;

}
