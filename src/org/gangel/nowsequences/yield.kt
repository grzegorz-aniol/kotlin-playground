package org.gangel.nowsequences

import kotlinx.coroutines.yield

fun generator(): Sequence<Int> {
    return sequence {
        println("Started generating values")
        yield(Int.MIN_VALUE)
        for (value in 1..16) {
            yield(value)
        }
        yield(Int.MAX_VALUE)
    }
}

fun main() {
    val seq = generator()
    println("Before generation")
    seq.forEach { println(it) }
}