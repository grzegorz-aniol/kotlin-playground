package org.gangel.dosomestatements

fun main(args: Array<String>) {
    ifvalue()

    elvisOperator("Not null value")
    elvisOperator(null)
}

fun ifvalue() {
    // if statement can be used as expression
    val result = if (Math.random() > 0.5) "UP" else "DOWN";
    println("Result is $result")
}

fun elvisOperator(mayBeNull: String?) {
    // but also we can use null safety operator and elvis operator for default value
    val notNullResult = mayBeNull?.length ?: 0
    println("Value is $notNullResult")
}
