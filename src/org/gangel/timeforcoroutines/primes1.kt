package org.gangel.timeforcoroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce


@OptIn(ExperimentalCoroutinesApi::class)
fun CoroutineScope.numbersFrom(start: Int) = produce {
    var x = start
    while (true) {
        println("Going to produce next number: $x")
        send(x++)
    } // infinite stream of integers from start
}

@OptIn(ExperimentalCoroutinesApi::class)
fun CoroutineScope.filter(numbers: ReceiveChannel<Int>, prime: Int) = produce {
    for (x in numbers) {
        if (x % prime != 0) {
            send(x)
        }
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
fun main() = runBlocking(Dispatchers.Default) {

    //sampleStart
    var cur = numbersFrom(2)
    for (i in 1..200) {
        val primeCandidate = cur.receive()
        println("Received number: $primeCandidate")
        cur = filter(cur, primeCandidate)
    }
    coroutineContext.cancelChildren() // cancel all children to let main finish
//sampleEnd
}

