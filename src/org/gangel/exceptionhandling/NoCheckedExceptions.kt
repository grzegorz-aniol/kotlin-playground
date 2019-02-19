package org.gangel.exceptionhandling

import java.io.FileReader
import java.io.IOException

fun main(args: Array<String>) {
    exceptionHandling()
    uncheckedExceptions()
}

fun uncheckedExceptions() {
    val reader = FileReader("unknown-file")
    val ch = reader.read() // <-- unchecked exception
}

fun exceptionHandling() {
    try {
        val reader = FileReader("unknown-file")
        val ch = reader.read() // <-- unchecked exception
    } catch (e: IOException) {
        println("Exception is thrown: ${e.message}")
    }
}
