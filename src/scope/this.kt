package scope

class ThisPerson(var name: String, var age: Int?=null)

fun main() {
    val person = ThisPerson("smith", 28)
    person.run { println("이름 : ${this.name}")
    println("나이 : ${this.name}")
    }

    val park = ThisPerson("Park").apply {
        age = 28
    }
    park.run {
        println("이름 : $name")
        println("나이 : $age")
    }
}