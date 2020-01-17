package org.gangel.timeforcoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
	runBlocking {
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
