package org.gangel.timeforcoroutines

import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.gangel.funwithfunctions.isPrimeMethod1
import java.math.BigDecimal
import java.util.concurrent.atomic.LongAdder


fun main(args: Array<String>) = runBlocking {

    var ranges = Channel<BigDecimal>()
    var minorDigit = arrayOf(BigDecimal.valueOf(1),BigDecimal.valueOf(3),BigDecimal.valueOf(7),BigDecimal.valueOf(9))
    val totalCount = LongAdder()

    for (i in 1..32) {
        launch {
            println("Starting coroutine")
            for (x in ranges) {
                for (digit in minorDigit) {
                    val n: BigDecimal = x.plus(digit)
                    if (isPrimeMethod1(n)) {
                        totalCount.increment()
                    }
                }
            }
        }
    }

    var producer = launch {
        var num: BigDecimal = BigDecimal.TEN
        val last: BigDecimal = BigDecimal.TEN.pow(5)
        while (num < last) {
            ranges.send(num)
            num += BigDecimal.TEN
        }
        ranges.close()
    }

    println("Waiting for producer")
    producer.join()
    println("Producer is done.")
    println("Primes found: " + totalCount.sum())
    coroutineContext.cancelChildren() // cancel all children to let main finish
}

