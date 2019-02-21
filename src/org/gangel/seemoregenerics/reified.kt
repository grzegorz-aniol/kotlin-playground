package org.gangel.seemoregenerics

/*
fun <T> filterTypes(input: List<*>) : List<T> {
    return input.asSequence()
            .filter{ it is T } // <-- can't check generic type at runtime - compilation error
            .map{ it as T }
            .toList()
}
*/

inline fun <reified T> filterTypes(input: List<*>) : List<T> {
    return input.asSequence()
            .filter{ it is T }
            .map{ it as T }
            .toList()
}

fun main(args: Array<String>) {

    val list = listOf("Mark", "Jane", 23, "Lisa", 38, "Greg")

    val cnt = filterTypes<String>(list).count()

    println(cnt)
}