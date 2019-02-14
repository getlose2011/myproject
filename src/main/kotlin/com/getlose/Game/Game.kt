package com.getlose.Game

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1
    print("secret: "+secret)
    var number = 0

    while(number != secret){
        print("please enter a number:")
        number = readLine()!!.toInt()//readLine()?.toInt()//scanner.nextInt()
        if(secret>number){
            println("higher")
        }else if(secret < number){
            println("lower")
        }else{
            print("got it")
        }
    }


}