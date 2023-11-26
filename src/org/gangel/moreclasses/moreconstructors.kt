package org.gangel.moreclasses

import java.time.LocalDateTime

class Person1(firstName: String, lastName: String) {

    val firstName: String

    val lastName: String

    var lastSeen: LocalDateTime? = null

    init {
        this.firstName = firstName
        this.lastName = lastName
    }

}

class Person2(fn: String) {
    val firstName = fn
}

fun main() {
    val p1 = Person1("Peter", "Pan")
    p1.lastSeen = LocalDateTime.now() // can change mutable property
    println("${p1.firstName} ${p1.lastName}")

    val p2 = Person2("Elisabeth")
    // p2.firstName = "test" <-- can't change immutable value
    println(p2.firstName)

}