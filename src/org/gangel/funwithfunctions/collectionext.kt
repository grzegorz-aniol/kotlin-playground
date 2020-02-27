package org.gangel.funwithfunctions

fun <T> Collection<T>?.requireNotEmpty(lazyMsg: () -> String): Collection<T> {
	if (this?.isEmpty() != false) {
		throw RuntimeException(lazyMsg())
	}
	return this
}

private data class Student(val name: String, val age: Int)

private fun getAdults(people: List<Student>): List<Student> =
	people.filter { it.age >= 18 }
		.requireNotEmpty { "At least one person need to be of age" }
		.toList()

