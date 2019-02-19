package org.gangel

class Person(val name : String) {

    fun display() = println("Display: ${name}")

    fun displayWithLambda(func: (s:String) -> Unit) = func(name)

}