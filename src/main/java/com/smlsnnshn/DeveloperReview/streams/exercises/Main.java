package com.smlsnnshn.DeveloperReview.streams.exercises;

import com.smlsnnshn.DeveloperReview.enums.Status;

public class Main {

    public static void main(String[] args) {

        System.out.println(StreamDemo.getListOfProject());

        System.out.println(StreamDemo.getListOfProject(Status.IN_PROGRESS));

        System.out.println(StreamDemo.getListOfProject(DataGenerator.manager1));

        System.out.println(StreamDemo.getProjectByProjectCode("PRJ001"));

        System.out.println(StreamDemo.getListUsers().size());

        System.out.println(StreamDemo.getUserByFirstName("Sarah").getId());

        System.out.println(StreamDemo.getUserByUserId(1L).getFirstName());

        System.out.println(StreamDemo.deleteUser("Sarah").size());

//        System.out.println(StreamDemo.updateProjectStatus(Status.IN_PROGRESS,Status.UAT_TEST));

        System.out.println(StreamDemo.findProjectByManager(DataGenerator.manager1));

//        System.out.println(StreamDemo.totalProjectDurationForManager(DataGenerator.manager1));

        System.out.println(StreamDemo.findTotalMaleInCompany());


    }

}
