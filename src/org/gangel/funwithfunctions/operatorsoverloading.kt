package org.gangel.funwithfunctions

fun main(args: Array<String>) {
    val xmlOutput = "html" % ("body" % ("p" % "Welcome!"))
    println(xmlOutput)
}

operator fun String.rem(rhv: String): String {
    return "<$this>$rhv</$this>"
}
