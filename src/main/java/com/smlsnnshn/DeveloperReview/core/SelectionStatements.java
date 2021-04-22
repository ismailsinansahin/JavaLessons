package com.smlsnnshn.DeveloperReview.core;

public class SelectionStatements {

    public static void demoIfStatement() {

        String userName = "Sahin";

        if (userName.equals("Ozzy")) {
            System.out.println("PASS");
        } else if (userName.equals("Mike")){
            System.out.println("FAIL");
        }else{
            System.out.println("NOT VALID");
        }

    }

    public static void demoSwitchCaseStatement(){

        String userName = "Mike";

        switch (userName){
            case "Mike":
                System.out.println("PASS");
                break;

            case "Sahin":
                System.out.println("FAIL");
                break;

            default:
                System.out.println("NOT VALID");
                break;

        }

    }

}
