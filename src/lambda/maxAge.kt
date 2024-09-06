package lambda

class Person(
    val name : String,
    val age : Int,
)

fun main() {
    val billGates = Person("Bill Gates", 30)
    val markZuckerberg = Person("Mark Zuckerberg", 20)
    val elonMusk = Person("Elon Musk", 10)

    val maxAge = listOf(billGates, markZuckerberg, elonMusk).maxOf { person -> person.age }
    println(maxAge)
}
