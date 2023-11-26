package org.gangel.dosomestatements

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    simpleWhenStatement("SecondValue")
    simpleWhenStatement("Something completely different")
    simpleWhenStatement(null)
    println(whenAsExpression("SecondValue"))
    println(whenAsExpression("---"))
    println(whenAsExpression(null))
    println(whenForInstances(arrayListOf(2, 3, 4)))
}


fun simpleWhenStatement(input: String?) {
    when (input) {
        "FirstValue" -> println("This is first value")
        "SecondValue" -> println("Second value")
        null -> println("This value is null!!")
        else -> println("It's unknown value")
    }
}

fun whenAsExpression(input: String?): String =
    when (input) {
        "FirstValue" -> "This is first value"
        "SecondValue" -> "Second value"
        null -> "This value is null!!"
        else -> "It's unknown value"
    }

fun <T> whenForInstances(list: List<T>): String {
    return when (list) {
        is ArrayList -> "array list"
        is LinkedList -> "linked list"
        else -> "unknown implementation"
    }
}
