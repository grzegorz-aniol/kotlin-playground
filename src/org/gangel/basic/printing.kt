package org.gangel.basic

import kotlin.random.Random

// Strings interpolation and multi-lines demo

fun main() {
    var name = "Marcus Miller"
    println("His name is $name")

    var car = Car("Porshe")
    println("Car name is ${car.name}")

    println("We can evaluate an expression ${Random.nextInt()}")

    println("""
        This is a very long story
        about many different and strange things
    """.trimIndent())

    println("""
    |    But it can be short
    |    if you wish
    """.trimMargin())

    val className = "Person"
    val propertyName = "name"
    val value = "John"
    println("""
        MATCH (n:$className)
        WHERE n.$propertyName = "$value"
    """.trimIndent())
}


