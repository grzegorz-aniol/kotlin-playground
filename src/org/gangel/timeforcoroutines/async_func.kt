package org.gangel.timeforcoroutines

import kotlinx.coroutines.*

fun main() {
	runBlocking(Dispatchers.Default) {
		asyncCalls()
	}
}

suspend fun asyncCalls() = coroutineScope {
	val items = listOf(1,2,3)
	val awaits = items.mapIndexed { idx, _ -> async {
		print("Item $idx\n")
		delay(2000)
	}}
	awaits.awaitAll()
	println("Done.")
}
