package Class

class Person (val name : String, val age : Int){
    init {
        println("Person이 생성되었습니다! 이름 : $name, 나이 : $age")
    }
    var email: String = "Unknown"

    constructor(name : String, age : Int, email: String) : this(name, age){
        this.email = email
    }
}

fun main(){
    val newPerson = Person("DH", 24) //User가 생성되었습니다! 이름 : DH, 나이 : 24
    println("${newPerson.name}, ${newPerson.email}") //DH, Unknown
}