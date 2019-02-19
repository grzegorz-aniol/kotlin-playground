package org.gangel.basic

fun main(args: Array<String>) {
    printLength("This is short text")
    printLength(null)
}

fun printLength(input: String?) {
    val len = input?.length
    println("Length is $len")
}