package com.getlose

import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter = LocalDateTime.of(
        2019,2,15,11,48,0
    )
    val leave = LocalDateTime.of(
        2019,2,15,13,49,0
    )
    val car = Car("AA-0987",enter)
    car.leave = leave
    car.aaaaa = "eeeeee"
    println(Math.ceil(car.duration()/60.0).toLong())
    println(car.aaaaa)
}

class Car(val id:String,val enter:LocalDateTime){
    var leave:LocalDateTime?=null
    set(value) {
        if(enter.isBefore(value))
            field = value
    }

    var aaaaa:String?=null
        set(value) {
                field = "${value}111"
        }


    fun duration() = Duration.between(enter,leave).toMinutes()

}