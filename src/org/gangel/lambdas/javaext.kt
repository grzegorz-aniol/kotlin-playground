package org.gangel.lambdas

data class Address(val street: String, val num: String, val post: String, val city: String, val country: String? = "USA")

interface AbstractPerson {
    val name: String
    val address: Address?
}

data class Person(override val name: String, val age: Int, override val address: Address? = null) : AbstractPerson

data class Customer(override val name: String, override val address: Address? = null) : AbstractPerson

fun main() {
    val items = listOf(
        Person(name = "Mark", age = 25, address = Address(street = "Western Road", num = "25AB", post = "445566", city = "Houston")),
        Person(name = "Emily", age = 25),
        Customer(name = "Facebook", address = Address(street = "Street", num = "123", post = "5678", city = "Los Angeles")),
        Person(name = "John", age = 45, address = Address(street = "Eastern Ave", num = "33", post = "33445566", city = "Los Angeles"))
    )

    val addressesByCountry1 = items.map { it.address }
        .filterNotNull()
        .groupBy { it.country }
    println(addressesByCountry1)

    val addressesByCountry2 = items.mapNotNull { it.address }
        .groupBy { it.country }
    println(addressesByCountry2)

    val peopleSortedByName = items.sortedBy { it.name }
    println(peopleSortedByName)

    val onlyCustomers = items.filterIsInstance(Customer::class.java)
    println(onlyCustomers)

    val mapOfItems = items.withIndex()
        .map { it.index to it.value }
        .toMap()
    println(mapOfItems)
}