package com.getlose

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val url = URL("https://api.myjson.com/bins/1ftany")
    println(url.readText())

    /*
    with(url.openConnection() as HttpURLConnection){
        var br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }
    }
    */

    /*
    val connection = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connection.inputStream))
    var line = br.readLine()
    var json = StringBuilder()
    while(line != null){
        json.append(line)
        line = br.readLine()
    }
    println(json.toString())
    */
}