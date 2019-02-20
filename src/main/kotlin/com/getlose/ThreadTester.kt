package com.getlose


import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    Thread({
        for(i in 1..10){
            Thread.sleep(50)
            println("thread => ${i}")
        }
    }).start()

    thread {
        for(i in 1..10){
            println("thread_1 ${i}")
            Thread.sleep(50)
        }
    }

    GlobalScope.launch {
        for(i in 1..10){
            println("coroutines: ${i}")
            //coroutines有delay延遲
            delay(50L)
        }
    }

}