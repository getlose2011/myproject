package com.getlose

import java.io.File

fun main(args: Array<String>) {

    //write()

    //read
    File("output.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun write() {
    //File("output.txt").writeText("eeeeeab")
    //use 自動關閉不用close、flush
//    File("output.txt").printWriter().use {
//        it.println("1st line")
//        it.println("2nd line")
//    }

    //如果大量寫資料的話效率會比較好
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3rd line\n")
    }
}