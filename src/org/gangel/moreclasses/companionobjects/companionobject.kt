package org.gangel.moreclasses.companionobjects

data class Car(val name: String, val type: String, val power: Int){

    companion object {
        // @JvmStatic <-- use this annotation if you need to run it statically from Java code
        fun buildFromString(txt: String): Car {
            val args = txt.split(",")
            return Car(args[0], args[1], Integer.parseInt(args[2]))
        }
    }

    object Internal {
        fun hello() {
            print("Hello from Internal")
        }
    }
}

fun main() {
    val c1 = Car.buildFromString("Fiat,500,500")
    println(c1)
    Car.Internal.hello()
}
