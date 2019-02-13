package com.getlose.student

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("please enter student's name:")
    var name = scanner.next()
    print("please enter math score:")
    var math = scanner.nextInt()
    print("please enter english score:")
    var english = scanner.nextInt()
    val stu = Student(name,english,math)
    stu.print()
}

class Student(var name:String,var english:Int,var math:Int){

    fun print(){

        print(name+"\t"+english+"\t"+math)
    }

}