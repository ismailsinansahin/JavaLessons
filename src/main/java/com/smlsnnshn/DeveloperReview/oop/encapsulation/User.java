package com.smlsnnshn.DeveloperReview.oop.encapsulation;


import com.smlsnnshn.DeveloperReview.enums.Gender;
import com.smlsnnshn.DeveloperReview.oop.inheritance.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private Role role;
    private Gender gender;

    public User(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime,
                long lastUpdateUserId, String firstName, String lastName, Role role, Gender gender) {

        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.gender = gender;

    }

}
