package com.getlose

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    var c = 1
//    var ms = measureTimeMillis {
//        for(i in 1..100000){
//            thread {
//                c++
//            }
//        }
//    }

    var ms = measureTimeMillis {
        for (i in 1..100000){
            GlobalScope.launch {
                c++
            }
        }
    }
    println(ms)
}