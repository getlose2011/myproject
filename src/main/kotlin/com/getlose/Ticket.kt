package com.getlose

import java.util.*

data class Ticket(val origi:Int, val destination: Int, val price:Int)

fun main(args: Array<String>) {
    var ticket = Ticket(1,22,20)
    val s = "33444433"
    print(s.validate())
    //println((1..10).random())
    println(Random().nextInt(10)+1)
}

fun String.validate() : Boolean{
    return this.length >= 6
}

fun IntRange.random():Int{
    return Random().nextInt(endInclusive-start)+start
}