package org.gangel.moreclasses

import java.time.LocalDateTime
import java.util.*

sealed class TransactionState {}

class None: TransactionState()
class InProgress(val startTime: LocalDateTime, val amount: Currency): TransactionState()
class Canceled(val reason: String): TransactionState()
class Completed(val endTime: LocalDateTime): TransactionState()
class PartiallyCompleted(val endTime: LocalDateTime, val amountDone: Currency): TransactionState()
class Outdated(): TransactionState()
class UnknownState(): TransactionState()

fun main() {
    val ts: TransactionState = InProgress(LocalDateTime.now(), Currency.getInstance(Locale.US))

    val newState = when(ts) {
        is None -> throw RuntimeException("Can't proceed without transaction")
        is InProgress -> {
            println("${ts.amount}, ${ts.startTime}")
            Canceled("I don't have a time right now")
        }
        else -> {
            println("Unknown state")
            UnknownState()
        }
    }

    println("New state = $newState")
}
