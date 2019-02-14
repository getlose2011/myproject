package com.getlose.student

import java.util.*

fun main(args: Array<String>) {
    userInput()
}

private fun userInput() {
    val stu = Student("aa", 33, 55)
    stu.print()
//    val scanner = Scanner(System.`in`)
//    print("please enter student's name:")
//    var name = scanner.next()
//    print("please enter math score:")
//    var math = scanner.nextInt()
//    print("please enter english score:")
//    var english = scanner.nextInt()
//    val stu = Student(name, english, math)
//    stu.print()
//    println("high score ${stu.higher()}")
}

class Student(var name:String,var english:Int,var math:Int){

    fun print(){
        print(name+"\t"+english+"\t"+math+"\t"+
            getAverage()+"\t"+if(getAverage()<60)"fail" else "pass")
        println("\t"+grading())
    }

    fun grading():Char{
        //method 1
//        var grading : Char = when(getAverage()){
//            in 90..100 -> 'A'
//            in 80..89 -> 'B'
//            in 70..79 -> 'C'
//            in 60..69-> 'D'
//            else -> 'F'
//        }
//        return grading

        //method 2
        return when(getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69-> 'D'
            else -> 'F'
        }
    }

    fun higher():Int{
        //kotlin沒有三元運式
        var max = 0;
        max = if(english>math){
            english
        } else {
            math
        }
        return max
    }

//    fun getAverage():Int{
//        return (math+english)/2
//    }

    //方法可以直接運算
    fun getAverage() = (math+english)/2

}