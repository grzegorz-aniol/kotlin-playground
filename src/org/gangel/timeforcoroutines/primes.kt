package org.gangel.timeforcoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.gangel.funwithfunctions.isPrimeMethod1
import java.math.BigDecimal
import java.util.concurrent.atomic.LongAdder


fun main() = runBlocking(Dispatchers.Default) {

    val ranges = Channel<BigDecimal>()
    val minorDigit = arrayOf(BigDecimal.valueOf(1),BigDecimal.valueOf(3),BigDecimal.valueOf(7),BigDecimal.valueOf(9))
    val totalCount = LongAdder()

    val jobs = (1..32).map {
        launch {
            println("Starting coroutine")
            val localCount = LongAdder()
            for (x in ranges) {
                for (digit in minorDigit) {
                    val n: BigDecimal = x.plus(digit)
                    if (isPrimeMethod1(n)) {
                        totalCount.increment()
                        localCount.increment()
                    }
                }
            }
            println("Local counter: " + localCount.sum())
        }
    }

    val producer = launch {
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

    println("Waiting for jobs")
    jobs.forEach { it.join() }
    println("Primes found: " + totalCount.sum())
}

