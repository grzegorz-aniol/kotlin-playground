package org.gangel.funwithfunctions

import java.time.LocalDateTime

fun main(args: Array<String>) {
    val str =
            """
                    Let's   try to compress   this string          
            """

    // we can call this utility function like this
    val result1 = packString(str)
    println("Result 1 = '$result1'")

    // but we could define it as a part of String class!! :D
    val result2 = str.pack()
    println("Result 2 = '$result2'")

    val datetime = LocalDateTime.now()
    println(datetime.toISO())
}

fun packString(input: String) = input.replace(Regex("\\s+"), " ").trim()

// we can declare extension function that is static function seen as a part of class methods
// however we use 'this' expression to indicate the associated object with the call
fun String.pack() = this.replace(Regex("\\s+"), " ").trim()


fun LocalDateTime.toISO(): String = this.toString()

