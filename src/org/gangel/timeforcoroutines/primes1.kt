package org.gangel.timeforcoroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main() = runBlocking {

    fun CoroutineScope.numbersFrom(start: Int) = produce<Int> {
        var x = start
        while (true) send(x++) // infinite stream of integers from start
    }

    fun CoroutineScope.filter(numbers: ReceiveChannel<Int>, prime: Int) = produce<Int> {
        for (x in numbers) if (x % prime != 0) send(x)
    }

    //sampleStart
    var cur = numbersFrom(2)
    for (i in 1..10) {
        val prime = cur.receive()
        println(prime)
        cur = filter(cur, prime)
    }
    coroutineContext.cancelChildren() // cancel all children to let main finish
//sampleEnd
}

