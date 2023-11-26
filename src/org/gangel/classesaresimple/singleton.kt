package org.gangel.classesaresimple

// this is Singleton in Kotlin
object GlobalCache {

    val map: HashMap<String, String> = HashMap()

    fun add(key: String, value: String) {
        map.put(key, value)
    }

    fun clear() {
        map.clear()
    }

    fun findValue(value: String): String? {
        return map.values.firstOrNull { it == value }
    }

}

fun main() {
    GlobalCache.add("123", "Patrick")
    GlobalCache.add("345", "Patrick")
    GlobalCache.add("45111", "Sussan")
    val result = GlobalCache.findValue("Patrick")

    println(result == "Patrick")
}