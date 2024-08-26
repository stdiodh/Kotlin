package basic

fun main(){
    val john = Person("john", 20)
//    println(john.name)
//    println(john.age)
    println(john.hobby)

    val john2 = Person("john", 20)

//    println(john == john2)
    //setter(세터로 필드의 값을 초기화하고 새 값을 넣음)
}

// {} brace 에 사용하는 것이 아닌 () parentheses 에 사용
//()안의 값은 getter(게터로 필드 안의 값을 제공함)

// 더 쉽게하는 방법은 앞에 data를 붙임
data class Person(val name : String, var age : Int,)
//    equals hash로 둘이 같다고 표기할 수 있음

// init을 사용하여 별도의 실행코드를 만들 수 있음
{
    var hobby = "축구"
        //private set으로 밖에서 지정 못하게 막을 수 있음
        private set
        //getter로 재정의 가능
        get() = "취미 : $field"
//    init {
//        println("init")
//    }
    fun some(){
        hobby = "농구"
    }
}