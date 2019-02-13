package com.getlose

//打maina 加tab鍵會出現main方法
fun main(args: Array<String>) {
    //println("hello kotlin")
    //不用加new即可新增物件
    //Human().hello()
    val h = Human()
    h.hello()
    var age:Int = 20
    age = 23
    var a:Float = 66.4f
    val n = "getlose"
    var name:String
    name = "333"
    val aaa : String
    aaa = "eweew"
}

class Human{
    fun hello(){
        println("hello world...")
    }
}