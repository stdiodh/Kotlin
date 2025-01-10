package getSet

private class Person {
    var name: String = "John" // 기본 값
        get() = field // Getter: 값을 반환함
}

fun main() {
    val person = Person()
    println("이름: ${person.name}")  // Getter 호출 (출력: 이름: John)
}