package org.gangel.basic

fun main(args: Array<String>) {
    printLength("This is short text")
    printLength(null)
    nullTypeAssignment()
    typeCast("Any string object")

    forceNullTypeConvertion("This is a string")

    nullCheckingWithLet("This is a string")
}

fun printLength(input: String?) {
    val len = input?.length
    println("Length is $len")
}

fun nullTypeAssignment() {
    val x: String? = null
    // val y: String = x <-- can't assign null type to not null type, compilation error

    val default = "<empty>"
    val y: String = x ?: default // but we can use elvis operator that return object value in case of null
}

fun typeCast(obj: Any) {
    val newObj: String = obj as String // <-- this will throw an exception if obj is not a String
    val newObj2: String? = obj as? String // <-- this is safe, it will assign null if type cast do not match
    println(newObj?.length)
}

fun forceNullTypeConvertion(s: String?) {
    val nonNullVal: String = s!!  // <-- it will throw NPE if s is null!!!!
    println(nonNullVal.length)
}

fun nullCheckingWithLet(s: String?) {
    // let allows to do some stuff if object is not null - similarly to Optional in Java
    val parsedSquare = s?.let{
        val value = Integer.parseInt(it)
        value * 2
    }
}

