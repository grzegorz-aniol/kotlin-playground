package org.gangel.javainterop.nullability

import org.gangel.javainterop.nullability.JavaFun.*

fun main() {
	println(javaFun("key", null))
	println(javaFun(null, "value"))
	println(javaFun("key", "value"))
}