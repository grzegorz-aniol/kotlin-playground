package org.gangel.classesaresimple.inheritance

import java.util.*

abstract class BasicEntity : Entity, Identifiable {
    private val identifier: String

    constructor(id: String) {
        identifier = id
    }

    override fun getId(): String = identifier

    open fun generateNewId(): String = UUID.randomUUID().toString()
}
