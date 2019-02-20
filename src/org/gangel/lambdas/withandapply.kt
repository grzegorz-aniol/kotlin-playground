package org.gangel.lambdas

data class Product(val id: String, val desc: String, val price: Long) {
    var dailyDiscount: Double = 0.0
    var count: Int = 0
}

fun main(args: Array<String>) {
    val p1 = Product("ABD123", "Dell laptop", 45666)

    p1.apply { println("Product: $desc, Price: $price") }

    with(p1) {
        count = 234
        dailyDiscount = 0.02
    }
}