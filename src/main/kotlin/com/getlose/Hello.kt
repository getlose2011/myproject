package com.getlose

//打maina 加tab鍵會出現main方法
fun main(args: Array<String>) {
    //println("hello kotlin")
    //不用加new即可新增物件
    //Human().hello()
    val h = Human()
    h.hello()
}

class Human{
    fun hello(){
        println("hello world...")
    }
}