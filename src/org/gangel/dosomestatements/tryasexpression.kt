package org.gangel.dosomestatements

fun main(args: Array<String>) {
    println(parseInteger("123"))
    println(parseInteger("Can't parse it!"))
}

fun parseInteger(input: String):Int {
    // 'try' statement can be used as a value
    // in this example it returns parsed value
    // or default value in case of an exception
    return try {
        Integer.parseInt(input)
    } catch (e: NumberFormatException) {
        0
    }
}
