package getSet

private class Person {
    var age: Int = 0
        get() = field
        set(value) {
            if (value >= 0) field = value
            else println("나이는 0 이상이어야 합니다.")
        }
}

fun main() {
    val person = Person()
    person.age = 25  // Setter 호출
    println("나이: ${person.age}")  // Getter 호출
    person.age = -5  // 잘못된 값 (오류 메시지 출력)
}