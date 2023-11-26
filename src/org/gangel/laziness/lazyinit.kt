package org.gangel.laziness

data class Person(val name: String, val birthYear: Int)


fun main() {
    println("Start")
    val personLazy = lazy {
        println("Building person object")
        Person(name = "Greg", birthYear = 1999)
    }
    println("Get person")
    println(personLazy.value)
}