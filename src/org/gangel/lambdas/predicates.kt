package org.gangel.lambdas

fun main(args: Array<String>) {
    val data = listOf<Int>(2, 4, 3, 1, 3, 3, 4, 2, 0, -12, 123)

    val result = data.any { it % 2 == 0 }
    println("Any even number? $result")

    val result2 = data.all { it > 0 }
    println("All greater than zero? $result2")

    val result3 = data.takeWhile { it > 0 && it % 2 == 0 }
    println("First even numbers: $result3")
}