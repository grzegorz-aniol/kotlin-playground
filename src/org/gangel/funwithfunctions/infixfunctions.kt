package org.gangel.funwithfunctions

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    val query = "select a, min(b) from".embedVersion1("select x,y from Z")
    println(query)

    val query2 = "select a, min(b) from" embed "select x,y from Z"
    println(query2)
}

fun String.embedVersion1(body: String): String {
    return this + " (" + body + ") "
}


infix fun String.embed(body: String): String {
    return this + " (" + body + ") "
}
