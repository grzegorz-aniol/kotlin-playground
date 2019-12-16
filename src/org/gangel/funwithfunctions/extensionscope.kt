package org.gangel.funwithfunctions

class Person(private val name: String, val publicKey: String) {

	// It make no sense to add extension function here but it's possible
	// Then function has access to private field
	fun Person.somethingStrange(): String =
		name.replace("0", "-")
}

private val globalSeed: Int = 123

// This won't compile. Extension function declared outside receiver scope
// doesn't have access to private members
//fun Person.hash(): Int =
//	name.hashCode() % globalSeed

// However extension function have access to public fields
fun Person.printKey() =
	println(publicKey)

// Extension function have access to private fields in same file
fun Person.mutate(): Int =
	publicKey.hashCode() % globalSeed
