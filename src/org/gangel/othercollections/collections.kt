package org.gangel.othercollections

import org.gangel.javanullornotnull.Vertex

fun main(args: Array<String>) {

    val list1 = listOf("alpha", "beta", "gamma")

    var array1 = intArrayOf(1, 3, 4, 55)

    var mut1 = mutableListOf<Vertex>(Vertex(), Vertex(), Vertex())

    var mut2 = mutableSetOf<Long>(12312313L, 32342342L, 438593453L)

    var hasMap = hashMapOf<String, String>(Pair("1", "2"), Pair("DEDEDE", "ZAZAZA"))

    var muthashMap = mutableMapOf<Long, String>(Pair(234, "345"), Pair(345, "456"))
}