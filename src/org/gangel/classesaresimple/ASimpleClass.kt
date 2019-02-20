package org.gangel.classesaresimple

// This class contains constructor, 3 members and 3 getters and 3 setters!
// And all with just one line of code
class AClass(var firstName: String, var lastName: String, var age: Int) {}


// Don't you believe ?
fun main(args: Array<String>) {
    val obj1 = AClass("John", "Ford", 99)

    println("His name is ${obj1.firstName}")
    println("His age is ${obj1.age}")

    obj1.firstName = "Michael"
    println("His new name is ${obj1.firstName}")

}