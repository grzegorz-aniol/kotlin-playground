package org.gangel.javanullornotnull.types

import org.gangel.javanullornotnull.Vertex

fun main() {
    val obj = Vertex()

    val id: String = obj.id

    val type: String = obj.type

    // val type2: String = obj.typeWithNullable <-- compilation error
    val type2: String? = obj.typeWithNullable

    obj.type = null
    // obj.setTypeWithNullCheck(null) // <-- can't do this - compilation error
    obj.setTypeWithNullCheck("Person")

}