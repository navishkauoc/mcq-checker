package com.kariyawasam.mcqsystem;

import java.util.Scanner;

public class MCQSystem {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeSystem();
    }

    private static void initializeSystem() {
        String userName;
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                     *** Welcome to the MCQ System! ***");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Please enter your name: ");
        userName = scanner.next();
        scanner.nextLine();
        System.out.println();
        System.out.println("Hello! " + userName);
        choosingCourse();
    }

    private static void choosingCourse() {
        Integer courseNumber = null;
        System.out.println("Please choose a Course: ");
        System.out.println("(Hint: Enter the number of the course)");
        courseNumber = scanner.nextInt();
        scanner.nextLine();

        if (courseNumber <= 0 || courseNumber >= 5) {
            System.out.println("Please choose a number between 1 and 4");
            choosingCourse();
        }
        System.out.println("You've chosen the Course number " + courseNumber);
        displaySelectedCourse(courseNumber);
    }

    private static void displaySelectedCourse(Integer courseNumber) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                            * Course " + courseNumber + " *");
        System.out.println("----------------------------------------------------------------------------");

        switch (courseNumber) {
            case 1:
                CourseOne courseOne = new CourseOne();
                System.out.println();
                courseOne.displayQuestions();
                break;
            case 2:
//                CourseOne courseOne = new CourseOne();
//                System.out.println();
//                courseOne.displayQuestions();
                break;
            case 3:
//                CourseOne courseOne = new CourseOne();
//                System.out.println();
//                courseOne.displayQuestions();
                break;
            default:
                // course 04
        }
    }
}
