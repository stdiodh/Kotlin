package Class

open class Animal {
    open fun speak() = println("동물 소리")
}

class Cat : Animal() {
    override fun speak() {
        println("야옹!")
    }
}

fun main() {
    val cat = Cat().speak() //야옹!
}