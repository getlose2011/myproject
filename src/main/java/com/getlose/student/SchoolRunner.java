package com.getlose.student;

import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {
        userInput();
        //Student.getPass(); for kotlin有標千，java使用會少一層Companion

    }

    private static void userInput() {
        Students.pass = 40;
        Students stu1 = new Students("aaa",11,55);
        Students stu2 = new Students("bbb",33,55);
        Students stu3 = new Students("ccc",4,55);
        GraduateStudent gstu = new GraduateStudent("dd",33,55,55);
        stu1.print();
        stu2.print();
        stu3.print();
        gstu.print();

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
