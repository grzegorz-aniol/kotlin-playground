package org.gangel.classesaresimple

// This class contains constructor, 3 members and 3 getters
// And all with in fact one line of code
class AClass(val firstName: String, val lastName: String, val age: Int) {
}


// Don't you believe ?
fun main(args: Array<String>) {
    val obj1 = AClass("John", "Ford", 99)

    println("His name is ${obj1.firstName}")
    println("His age is ${obj1.age}")

}