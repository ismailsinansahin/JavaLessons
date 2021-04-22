package com.smlsnnshn.DeveloperReview.streams.exercises;

import com.smlsnnshn.DeveloperReview.enums.Gender;
import com.smlsnnshn.DeveloperReview.enums.Status;
import com.smlsnnshn.DeveloperReview.oop.encapsulation.User;
import com.smlsnnshn.DeveloperReview.oop.inheritance.Project;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static List<Project> getListOfProject(){
        return DataGenerator.getProjects().stream().collect(Collectors.toList());
    }

    public static List<Project> getListOfProject(Status status){
        return DataGenerator.getProjects().stream()
                .filter(project -> project.getProjectStatus().equals(status))
                .collect(Collectors.toList());
    }

    public static List<Project> getListOfProject(User manager){
        return DataGenerator.getProjects().stream()
                .filter(project -> project.getAssignedManager().equals(manager))
                .collect(Collectors.toList());
    }

    public static List<Project> getProjectByProjectCode(String projectCode){
        return DataGenerator.getProjects().stream()
                .filter(project -> project.getProjectCode().equals(projectCode))
                .collect(Collectors.toList());
    }

    public static List<User> getListUsers(){
        return DataGenerator.getUsers().stream().collect(Collectors.toList());
    }

    public static User getUserByFirstName(String firstName){
        return DataGenerator.getUsers().stream()
                .filter(user -> user.getFirstName().equals(firstName)).findAny().get();
    }

    public static User getUserByUserId(Long id){
        return DataGenerator.getUsers().stream()
                .filter(user -> user.getId()==id).findAny().get();
    }

    public static List<User> deleteUser(String firstName){
        return DataGenerator.getUsers().stream()
                .filter(user -> !user.getFirstName().equals(firstName))
                .collect(Collectors.toList());
    }

//    public static List<Project> updateProjectStatus(Status oldStatus, Status newStatus){
//        return DataGenerator.getProjects().stream()
//                .filter(project -> project.getProjectStatus().equals(oldStatus))
//                .map(project -> project.setProjectStatus(newStatus))
//                .collect(Collectors.toList());
//    }

    public static List<Project> findProjectByManager(User manager){
        return DataGenerator.getProjects().stream()
                .filter(project -> project.getAssignedManager().equals(manager))
                .collect(Collectors.toList());
    }

//    public static Integer totalProjectDurationForManager(User manager){
//        Integer duration;
//        return DataGenerator.getProjects().stream()
//                .filter(project -> project.getAssignedManager().equals(manager))
//                .map(project -> Period.between(project.getStartDate(),project.getEndDate()))
//                ;
//    }

    public static Long findTotalMaleInCompany(){
        return DataGenerator.getUsers().stream()
                .filter(user -> user.getGender().equals(Gender.MALE)).count();
    }

}
