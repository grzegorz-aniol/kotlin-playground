package org.gangel.dosomestatements

fun main(args: Array<String>) {

    // for loop with inclusive, closed range
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // reversed order
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    // for loop with every 2nd index
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()

    // for loop with Java-like, half closed range
    for (i in 0 until 10) {
        print("$i ")
    }
    println()

    // range is a type in Kotlin
    val arange = 1..13 step 2
    for (x in arange) {
        print("$x ")
    }
    println()

    // iteration over a list
    val items = listOf(1, 2, 3, 5, 8, 13, 21)
    for (y in items) print("$y ")
    println()
}
