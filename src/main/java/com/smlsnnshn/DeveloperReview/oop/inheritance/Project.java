package com.smlsnnshn.DeveloperReview.oop.inheritance;

import com.smlsnnshn.DeveloperReview.enums.Status;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.User;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Project extends BaseEntity{

    private String projectCode;
    private String projectName;
    private User assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status projectStatus;
    private String projectDetail;

    public Project(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateTime,
                   long lastUpdateUserId, String projectCode, String projectName, User assignedManager,
                   LocalDate startDate, LocalDate endDate, Status projectStatus, String projectDetail) {

        super(id, insertDateTime, insertUserId, lastUpdateTime, lastUpdateUserId);
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectStatus = projectStatus;
        this.projectDetail = projectDetail;

    }

}
