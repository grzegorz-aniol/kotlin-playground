package org.gangel.funwithfunctions

import java.math.BigDecimal

fun main(args: Array<String>) {
    checkPrimes(::isPrimeMethod1)
}

// this is 'higer order function' - it works with other functions as argument
fun checkPrimes(primechecker: (BigDecimal) -> Boolean) {
    // checkPrimes for values > 10
    var number = BigDecimal.TEN.inc()
    var lastNumber = BigDecimal.valueOf(1000L)
    while(number < lastNumber) {
        if (primechecker(number)) {
            println("$number, ")
        }
        number += BigDecimal.valueOf(2)
    }
}

fun isPrimeMethod1(number: BigDecimal): Boolean {
    val last = number.div(BigDecimal.valueOf(3))
    var idx = BigDecimal.valueOf(3)
    do {
        if (number % idx == BigDecimal.ZERO) {
            return false
        }
        idx += BigDecimal.valueOf(2)
    } while (idx <= last)
    return true
}