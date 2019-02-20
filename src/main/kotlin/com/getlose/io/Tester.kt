package com.getlose.io

import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException

fun main(args: Array<String>) {
    val file = File("data.txt")
    println(file.exists())
    println(file.absolutePath)

    try {
        val `is` = FileInputStream(file)
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
        println("file not found")
    }

    println("ssssss")
}