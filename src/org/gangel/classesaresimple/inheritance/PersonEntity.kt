package org.gangel.classesaresimple.inheritance

class PersonEntity(val name:String, id: String) : BasicEntity(id) {

    override fun read() {
        TODO("not implemented") 
    }

    override fun insert() {
        TODO("not implemented") 
    }

    override fun update() {
        TODO("not implemented") 
    }

    override fun delete() {
        TODO("not implemented") 
    }

    override fun replace() {
        TODO("not implemented") 
    }

    override fun generateNewId(): String {
        return name;
    }
}