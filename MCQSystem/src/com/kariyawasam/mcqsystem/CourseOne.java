package com.kariyawasam.mcqsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CourseOne {

    private int totalScore = 0;
    private static Scanner scanner = new Scanner(System.in);

    public Question prepareQuestionOne(boolean printValues) {
        List<String> answerList = Arrays.asList("Report", "Field", "Record", "File");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionOne = new Question("What is part of a database that holds only one type of information?", answers, "b");

        if (printValues) {
            System.out.println("Question 01");
            System.out.println(questionOne.getQuestion());
            System.out.println("    a. " + questionOne.getAnswers().get(0));
            System.out.println("    b. " + questionOne.getAnswers().get(1));
            System.out.println("    c. " + questionOne.getAnswers().get(2));
            System.out.println("    d. " + questionOne.getAnswers().get(3));
        }

        return questionOne;
    }

    public Question prepareQuestionTwo(boolean printValues) {
        List<String> answerList = Arrays.asList("Order of Significance", "Open Software", "Operating System", "Optical Sensor");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionTwo = new Question("'OS' computer abbreviation usually means?", answers, "c");

        if (printValues) {
            System.out.println("Question 02");
            System.out.println(questionTwo.getQuestion());
            System.out.println("    a. " + questionTwo.getAnswers().get(0));
            System.out.println("    b. " + questionTwo.getAnswers().get(1));
            System.out.println("    c. " + questionTwo.getAnswers().get(2));
            System.out.println("    d. " + questionTwo.getAnswers().get(3));

        }

        return questionTwo;
    }

    public Question prepareQuestionThree(boolean printValues) {
        List<String> answerList = Arrays.asList("Image file", "Animation/movie file", "Audio file", "MS Office document");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionThree = new Question("'.MOV' extension refers usually to what kind of file?", answers, "b");

        if (printValues) {
            System.out.println("Question 03");
            System.out.println(questionThree.getQuestion());
            System.out.println("    a. " + questionThree.getAnswers().get(0));
            System.out.println("    b. " + questionThree.getAnswers().get(1));
            System.out.println("    c. " + questionThree.getAnswers().get(2));
            System.out.println("    d. " + questionThree.getAnswers().get(3));
        }

        return questionThree;
    }

    public Question prepareQuestionFour(boolean printValues) {
        List<String> answerList = Arrays.asList("Image file", "Animation/movie file", "Audio file", "MS Office document");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionFour = new Question("'.MOV' extension refers usually to what kind of file?", answers, "b");

        if (printValues) {
            System.out.println("Question 04");
            System.out.println(questionFour.getQuestion());
            System.out.println("    a. " + questionFour.getAnswers().get(0));
            System.out.println("    b. " + questionFour.getAnswers().get(1));
            System.out.println("    c. " + questionFour.getAnswers().get(2));
            System.out.println("    d. " + questionFour.getAnswers().get(3));
        }


        return questionFour;
    }

    public Question prepareQuestionFive(boolean printValues) {
        List<String> answerList = Arrays.asList("Image file", "Animation/movie file", "Audio file", "MS Office document");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionFive = new Question("'.MOV' extension refers usually to what kind of file?", answers, "b");

        if (printValues) {
            System.out.println("Question 05");
            System.out.println(questionFive.getQuestion());
            System.out.println("    a. " + questionFive.getAnswers().get(0));
            System.out.println("    b. " + questionFive.getAnswers().get(1));
            System.out.println("    c. " + questionFive.getAnswers().get(2));
            System.out.println("    d. " + questionFive.getAnswers().get(3));
        }


        return questionFive;
    }

    public Question prepareQuestionSix(boolean printValues) {
        List<String> answerList = Arrays.asList("Image file", "Animation/movie file", "Audio file", "MS Office document");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionSix = new Question("'.MOV' extension refers usually to what kind of file?", answers, "b");

        if (printValues) {
            System.out.println("Question 06");
            System.out.println(questionSix.getQuestion());
            System.out.println("    a. " + questionSix.getAnswers().get(0));
            System.out.println("    b. " + questionSix.getAnswers().get(1));
            System.out.println("    c. " + questionSix.getAnswers().get(2));
            System.out.println("    d. " + questionSix.getAnswers().get(3));

        }

        return questionSix;
    }

    public Question prepareQuestionSeven(boolean printValues) {
        List<String> answerList = Arrays.asList("Image file", "Animation/movie file", "Audio file", "MS Office document");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionSeven = new Question("'.MOV' extension refers usually to what kind of file?", answers, "b");

        if (printValues) {
            System.out.println("Question 07");
            System.out.println(questionSeven.getQuestion());
            System.out.println("    a. " + questionSeven.getAnswers().get(0));
            System.out.println("    b. " + questionSeven.getAnswers().get(1));
            System.out.println("    c. " + questionSeven.getAnswers().get(2));
            System.out.println("    d. " + questionSeven.getAnswers().get(3));
        }

        return questionSeven;
    }

    public Question prepareQuestionEight(boolean printValues) {
        List<String> answerList = Arrays.asList("Image file", "Animation/movie file", "Audio file", "MS Office document");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionEight = new Question("'.MOV' extension refers usually to what kind of file?", answers, "b");

        if (printValues) {
            System.out.println("Question 08");
            System.out.println(questionEight.getQuestion());
            System.out.println("    a. " + questionEight.getAnswers().get(0));
            System.out.println("    b. " + questionEight.getAnswers().get(1));
            System.out.println("    c. " + questionEight.getAnswers().get(2));
            System.out.println("    d. " + questionEight.getAnswers().get(3));
        }

        return questionEight;
    }

    public Question prepareQuestionNine(boolean printValues) {
        List<String> answerList = Arrays.asList("Image file", "Animation/movie file", "Audio file", "MS Office document");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionNine = new Question("'.MOV' extension refers usually to what kind of file?", answers, "b");

        if (printValues) {
            System.out.println("Question 09");
            System.out.println(questionNine.getQuestion());
            System.out.println("    a. " + questionNine.getAnswers().get(0));
            System.out.println("    b. " + questionNine.getAnswers().get(1));
            System.out.println("    c. " + questionNine.getAnswers().get(2));
            System.out.println("    d. " + questionNine.getAnswers().get(3));
        }


        return questionNine;
    }

    public Question prepareQuestionTen(boolean printValues) {
        List<String> answerList = Arrays.asList("Image file", "Animation/movie file", "Audio file", "MS Office document");
        ArrayList<String> answers = new ArrayList<>();
        answers.addAll(answerList);
        Question questionTen = new Question("'.MOV' extension refers usually to what kind of file?", answers, "b");

        if (printValues) {
            System.out.println("Question 10");
            System.out.println(questionTen.getQuestion());
            System.out.println("    a. " + questionTen.getAnswers().get(0));
            System.out.println("    b. " + questionTen.getAnswers().get(1));
            System.out.println("    c. " + questionTen.getAnswers().get(2));
            System.out.println("    d. " + questionTen.getAnswers().get(3));

        }

        return questionTen;
    }

    public void displayQuestions() {
        prepareQuestionOne(true);
        System.out.println();
        prepareQuestionTwo(true);
        System.out.println();
        prepareQuestionThree(true);
        System.out.println();
        prepareQuestionFour(true);
        System.out.println();
        prepareQuestionFive(true);
        System.out.println();
        prepareQuestionSix(true);
        System.out.println();
        prepareQuestionSeven(true);
        System.out.println();
        prepareQuestionEight(true);
        System.out.println();
        prepareQuestionNine(true);
        System.out.println();
        prepareQuestionTen(true);
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        getAnswers();
    }

    public void getAnswers() {
        String answer = "";

        System.out.println("*** Provide the answers to above 10 questions ***");
        System.out.println();
        prepareQuestionOne(false);
        System.out.println();
        System.out.println("Answer for question 01: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionOne(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("Answer for question 02: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionTwo(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("Answer for question 03: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionThree(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("Answer for question 04: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionFour(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("Answer for question 05: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionFive(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("Answer for question 06: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionSix(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("Answer for question 07: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionSeven(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("Answer for question 08: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionEight(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("Answer for question 09: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionNine(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("Answer for question 10: ");
        answer = scanner.next();
        scanner.nextLine();

        if (answer.equalsIgnoreCase(prepareQuestionTen(false).getCorrectAnswer())) {
            System.out.println("Correct");
            totalScore += 1;
        } else {
            System.out.println("Incorrect");
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(totalScore);

        if (totalScore == 10) {
            System.out.println("Excellent");
        } else if (totalScore == 9) {
            System.out.println("Well Done");
        } else if (totalScore >= 7) {
            System.out.println("Very Good");
        } else if (totalScore >= 5) {
            System.out.println("Good");
        } else if (totalScore == 4) {
            System.out.println("Average");
        } else if (totalScore == 3) {
            System.out.println("Better");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Total: " + totalScore + " & Average: " + totalScore*10 + "%");
        System.out.println("Number of wrong answers: " + (10-totalScore));

        System.out.println();
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Do you want to retry? Y/N");
        String retry;

        retry = scanner.next();
        scanner.nextLine();

        if (retry.equalsIgnoreCase("y")) {
            System.out.println();
            System.out.println("                     * Course 01 *");
            System.out.println("----------------------------------------------------------------------------");
            displayQuestions();
        } else {
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("                            * Thank you *");
            System.out.println("----------------------------------------------------------------------------");
        }

    }
}
