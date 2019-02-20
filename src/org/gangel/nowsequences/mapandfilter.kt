package org.gangel.nowsequences

fun main(args: Array<String>) {
    val data = listOf(1, 3, 9, 10, 11, 44, 54, 23, 43, 22, 48, 10)

    var counter = 0
    data.filter{ ++counter; it % 2 == 0}
            .map{ counter++; it / 2 }
            .filter{ ++counter; it < 15 }
            .take(3)
            .forEach(::println)
    println("Coutner = $counter\n\n")

    counter = 0
    data.asSequence().filter{ ++counter; it % 2 == 0}
            .map{ counter++; it / 2 }
            .filter{ ++counter; it < 15 }
            .take(3)
            .forEach(::println)
    println("Counter = $counter\n\n")

}