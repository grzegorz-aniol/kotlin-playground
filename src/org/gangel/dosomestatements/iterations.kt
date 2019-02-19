package org.gangel.dosomestatements

import java.util.*

fun main(args: Array<String>) {
    iterationOverList()
    iterationOverListWithIndex()
    iterationOverMapEntires()
    iterateWithRange('a'..'z')
}

fun iterationOverListWithIndex() {
    // iteration over a list
    val items = listOf(1, 2, 3, 5, 8, 13, 21)
    for ((idx, value) in items.withIndex())
        print("[$idx]=$value, ")
    println()

}

fun iterationOverList() {
    // iteration over a list
    val items = listOf(1, 2, 3, 5, 8, 13, 21)
    for (y in items) print("$y ")
    println()
}

fun iterationOverMapEntires() {
    var ages = mapOf(Pair("John",22), Pair("Kate",25), Pair("Lisa", 39))
    for ((name, age) in ages) {
        println("$name is $age")
    }
}

fun iterateWithRange(charRange: CharRange) {
    for(ch in charRange) {
        print("$ch, ")
    }
    println()
}
