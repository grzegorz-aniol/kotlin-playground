package org.gangel.moreclasses

data class Person(val name: String, val age: Int) {

    // nested singleton object
    object InternalItem {
        var value: Int = 0
        fun get() = ++value
    }

    fun get() = InternalItem.get()
}

fun main(args: Array<String>) {
    val p1 = Person("Lisa", 44)
    val p2 = Person("Kevin", 34)
    val p3 = Person("Maria", 18)

    // sorting by age
    listOf(p1, p2, p3)
            .forEach {
                println(it)
                println(it.get())
            }
}
