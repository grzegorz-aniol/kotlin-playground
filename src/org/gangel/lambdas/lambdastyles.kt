package org.gangel.lambdas

import java.math.BigDecimal

// class represents single entry from customer's order
// For simplicity, Int type is used for money value
class OrderItem(val product: String, val amount: Long, val price: Long) {
}

// calculating the total cost of the order
fun calculateTotalPrice(items: List<OrderItem>, deliveryCost: Long, discount: (Long) -> Long): Long {
    val totalSum: Long = items.fold(0L) { acc, orderItem -> acc + orderItem.amount * orderItem.price }
    return totalSum + deliveryCost - discount(totalSum)
}

// strategy for calculating a discount
fun discountStrategy(price: Long): Long {
    return Math.round(0.05 * price)
}

fun main(args: Array<String>) {

    // demo data
    val listOf = listOf(
        OrderItem("Getting Things Done, D.Allen", 1, 123),
        OrderItem("Spring in action, C.Walls", 1, 234),
        OrderItem("Handmade bookmark", 3, 2)
    )

    // How we can use lambda?

    // we can specify implicitly a function that match the signature
    val total0 = calculateTotalPrice(listOf, 5, ::discountStrategy)
    println(total0)

    // it can be specified inline
    val total1 = calculateTotalPrice(listOf, 5, { it -> Math.round(0.05 * it) })
    println(total1)

    // as it's the last argument it can be excluded from brackets
    val total2 = calculateTotalPrice(listOf, 5) { it -> Math.round(0.05 * it) }
    println(total2)

    // in case of just one lambda's argument, the name can be implicit ('it')
    val total3 = calculateTotalPrice(listOf, 5) { Math.round(0.05 * it) }
    println(total3)

}
