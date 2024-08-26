package scope

class thisPerson(var name: String, var age: Int?=null)

fun main() {
    val person = thisPerson("smith", 28)
    person.run { println("이름 : ${this.name}")
    println("나이 : ${this.name}")
    }

    val park = thisPerson("Park").apply {
        age = 28
    }
    park.run {
        println("이름 : $name")
        println("나이 : $age")
    }
}