package org.gangel.javainterop.nullability

import org.gangel.javainterop.nullability.JavaFun.*

fun main(vararg args: String) {
	println(javaFun("key", null))
	println(javaFun(null, "value"))
	println(javaFun("key", "value"))
}