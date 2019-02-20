package org.gangel.javanullornotnull.collections

import org.gangel.javanullornotnull.Vertex
import org.gangel.javanullornotnull.VertexProcessor

fun main(args: Array<String>) {
    val proc1 = VertexProcessorVariant1()
}

// each of method signature is proper
// we need to decide how we deal with nullability of platform collections from Java

class VertexProcessorVariant1 : VertexProcessor() {
    override fun process(elements: MutableList<Vertex>?) {
    }
}

class VertexProcessorVariant2 : VertexProcessor() {
    override fun process(elements: MutableList<Vertex?>?) {
    }
}

class VertexProcessorVariant3 : VertexProcessor() {
    override fun process(elements: MutableList<Vertex>?) {
    }
}

class VertexProcessorVariant4 : VertexProcessor() {
    override fun process(elements: List<Vertex>) {
    }
}
