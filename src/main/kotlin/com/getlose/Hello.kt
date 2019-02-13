package com.getlose

//打maina 加tab鍵會出現main方法
fun main(args: Array<String>) {
    //println("hello kotlin")
    //不用加new即可新增物件
    //Human().hello()
    val h = Human(66.0f,1.11f)
    print(h.Bmi())
    var c : Char = 'A';
    System.out.println(c.toInt() > 90);
    //h.hello()
//    var age:Int = 20
//    age = 23
//    var a:Float = 66.4f
//    val n = "getlose"
//    var name:String
//    name = "333"
//    val aaa : String
//    aaa = "eweew"
}

//主要建構子
class Human(var weight:Float,var height:Float,var name:String = ""){
    //init 會在建構子完成後自動執行init
    init {
        print("test $")
    }
    fun hello(){
        println("hello world...")
    }

    fun Bmi():Float{
        return weight/(height*height)
    }

}