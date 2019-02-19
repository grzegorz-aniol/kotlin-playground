package org.gangel.dosomestatements

fun main(args: Array<String>) {
    simpleWhenStatement("SecondValue")
    simpleWhenStatement("Something completely different")
    simpleWhenStatement(null)
}


fun simpleWhenStatement(input: String?) {
    when (input) {
        "FirstValue" -> println("This is first value")
        "SecondValue" -> println("Second value")
        null -> println("This value is null!!")
        else -> println("It's unknown value")
    }
}