package com.getlose.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {

    public static void main(String[] args) {
        int secret = new Random().nextInt(10)+1;
        System.out.println("secret number is "+secret);
        Scanner scanner = new Scanner(System.in);
        for(int i = 1;i<50;i++){
            System.out.print("please key a number("+i+"/4):");
            int number = scanner.nextInt();
            if(secret>number){
                System.out.println("higher");
            }else if(secret < number){
                System.out.println("lower");
            }else{
                System.out.println("got it");
                break;
            }
        }
    }

}
