package com.getlose.guess;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =0;
        while(number != -1){
            System.out.print("Please enter a number:");
            number = scanner.nextInt();
            System.out.println(number);
        }

    }

}
