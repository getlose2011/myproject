package com.getlose.Game

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    println(secret)
    for(i in 1..5){
//        print("please key a number:")
//        var number = scanner.nextInt()
//        println("第${i}次, ${number}")
//        if(number == -1)
//            break

        print("please key a number("+i+"/4):")
        var number = scanner.nextInt();
        if(secret>number){
            println("higher")
        }else if(secret < number){
            println("lower")
        }else{
            println("got it")
            break;
        }
    }

}