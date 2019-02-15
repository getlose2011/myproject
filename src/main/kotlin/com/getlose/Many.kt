package com.getlose

import java.time.LocalDateTime

fun main(args: Array<String>) {

    val parkingLot = HashMap<String,Car>()

    val enter = LocalDateTime.of(2019,2,15,14,49,0)
    var car:Car? = Car("AA-001",enter)
    parkingLot.put(car!!.id,car)
    car = Car("AB-302",enter.plusMinutes(15))
    parkingLot.put(car.id,car)

    //car 1 leave
    val leave = LocalDateTime.of(2019,2,15,15,0,0)

    car = parkingLot.get("AA-001")
    car?.leave = leave
    println("${car?.id}=> duration ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
    //car 2 leave
    car = parkingLot.get("AB-302")
    car?.leave = leave.plusHours(2)
    println("${car?.id}=> duration ${car?.duration()}")
//    val list = listOf(2,3)
//    println(list)
//    //listOf immutable
//    var scores = listOf(3,44,55)
//
//    for (score in scores) {
//        print(score)
//    }
//
//    //mutable
//    var mutableList = mutableListOf(45,44,33)
//    mutableList.add(33)
//    println(mutableList)
}