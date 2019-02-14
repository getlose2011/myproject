package com.getlose.student;

import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {
        userInput();
    }

    private static void userInput() {
        Students stu = new Students("dddd",98,55);
        stu.print();
//        System.out.print("please enter student's name:");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.print("please enter english score:");
//        int english = scanner.nextInt();
//        System.out.print("please enter math score:");
//        int math = scanner.nextInt();
//        Students stu = new Students(name,english,math);
//        stu.print();
//        System.out.println(stu.higher());
//        System.out.println(stu.getAverage());
    }

}
