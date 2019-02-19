@file:JvmName("FunWithFunctions")
package org.gangel.funwithfunctions

fun main(args: Array<String>) {
    // we can omitt default parameters
    defaultParameters("Anna", 22)
    defaultParameters("Patrick")

    // we can used named parameters, in any order
    defaultParameters(age = 22, name = "Anna")
    defaultParameters("Anna", age = 22)
    defaultParameters(name = "Anna")

    // but we can't mixed positional and named arguments
    // positional arguments, if any, should go first
    // defaultParameters(age = 22, "Anna") <-- compiler error

}

fun defaultParameters(name: String, age:Int = 18) {
    println("Person: $name, age: $age")
}

@JvmOverloads
fun defaultParametersWithOverloadForJava(name: String, age:Int = 18) {
    println("Person: $name, age: $age")
}
