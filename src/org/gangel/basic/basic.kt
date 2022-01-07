package org.gangel.basic

// basic HelloWorld example

// static functions can be declared without the class
// in fact basic.class will be created to aggregate this method
fun main(args : Array<String>) {
    println("Hello world!")   // no semicolon at the end of line ! :)
    nextMethod("Welcome!")
    variables()
    nullVariables()
    variablesTypeInference()
    newObjectCreation()
}

// simple oneliners can be declared using '=' sign
fun nextMethod(s : String) = println(s)

fun variables() {
    val immutableVariable : String = "Welcome"
    var mutableVariable : Int

    mutableVariable = 123

    // can't change immutable variable
    // immutableVariable = "Hello" <- ERROR

}

fun nullVariables() {
    var nullableValue : Int?
    nullableValue = null

    var notNullValue : String = "This need to be initialized with value"
    // notNullValue = null <-- ERROR

    // this condition is always TRUE
    // and you don't need to check it
    if (notNullValue != null) {
        // then bla, bla, bla
    }
}

fun variablesTypeInference() {
    // You don't need to always specify value types
    // Compiler may inference it by right side value
    val stringValue = "This is a string"
    val numericValue = 123
    val piValue = 3.1415926

    println(stringValue)
    println(numericValue)
    println(piValue)
}

fun newObjectCreation() {
    // no 'new' keyword, variable type is determined by right hand value
    val obj1 = Car("Ferrari")

    // 'name' is public by default
    println(obj1.name)

    obj1.name = "John Lennon"
    println(obj1.name)
}

// one file may contain more classes
class Car {

    constructor(n: String) {
        name = n
    }

    var name : String = ""

}