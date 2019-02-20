package org.gangel.moreclasses

data class Person(val name: String, val age: Int) {

    // nested singletone comparator
    object CompareByAge: Comparator<Person> {
        override fun compare(p0: Person?, p1: Person?): Int {
            return Comparator.naturalOrder<Int>().compare(p0?.age, p1?.age)
        }
    }
}

fun main(args: Array<String>) {
    val p1 = Person("Lisa", 44)
    val p2 = Person("Kevin", 34)
    val p3 = Person("Maria", 18)

    // sorting by age
    listOf(p1, p2, p3).sortedWith(Person.CompareByAge)
            .forEach { println(it)}
}