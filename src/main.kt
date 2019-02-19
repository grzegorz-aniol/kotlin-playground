import org.gangel.Person

fun main(args : Array<String>) {
    println("Hello world!")

    val kevin = Person("Greg")

    println("Name is ${kevin.name}")
    kevin.display()

    kevin.displayWithLambda { s -> println(s) }

}