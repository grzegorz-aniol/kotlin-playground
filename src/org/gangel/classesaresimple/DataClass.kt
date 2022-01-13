package org.gangel.classesaresimple

import java.time.LocalDateTime

// this is data class object
// it contains:
// * two immutable properties (id, name) with getters
// * one mutable property (lastSeen) with getter & setter
// * overwritten hashCode, equals and toString methods
// * copy method
data class DataClass(val id: String, val name: String, var lastSeen: LocalDateTime) {
}

fun main(args: Array<String>) {
    var data1 = DataClass("12", "Mark", LocalDateTime.now().minusDays(10))
    println("Data1 = $data1")

    var data2 = DataClass("22", "Peggy", LocalDateTime.now().minusDays(33).minusHours(7))
    println("Data2 = $data2")

    var data3 = data1.copy(id = "345")
    println("Data3 = $data3")

    var equality = data2.copy() == data2
    println("Copies are equal? $equality")

    var otherValue = data2.copy()
    var hashCodeEquality = (data2.hashCode() == otherValue.hashCode())
    println("Hashcode for copies equal? $hashCodeEquality")
}

