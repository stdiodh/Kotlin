fun main(){
    val john = Person("jon", 20)
    println(john.name)
    println(john.age)

    //세터 : 필드의 값을 초기화하고 새 값을 넣음
    john.age = 21
}

// {} brace 에 사용하는 것이 아닌 () parentheses 에 사용
class Person(val name : String, var age : Int,) {

}