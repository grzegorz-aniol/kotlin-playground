package org.gangel.funwithfunctions

fun main(args: Array<String>) {
    val str = "Let's try to pack this string"

    // we can call this utility function like this
    println(packString(str))

    // but we could define it as a part of String class!! :D
    println(str.pack())
}

fun packString(input: String) = input.replace("\\W", "")

// we can declare extension function that is static function seen as a part of class methods
// however we use 'this' expression to indicate the associated object with the call
fun String.pack() = this.replace("\\W", "")
