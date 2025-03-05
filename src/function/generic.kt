package function

//class AppleBox(val apple: Apple)


class AppleBox(val item: Any)

//fun main() {
//    val appleBox = AppleBox("책")
//    val apple = appleBox.item as String // ❌ 런타임 오류 가능
//
//    print(apple)
//}

//class Box<out T>(val item: T)
open class Fruit
class Apple : Fruit()

//val fruitBox : Box<Fruit> = Box(Apple())

class Box<in T>{
    fun put(item: T){

    }
}

fun <T : Fruit> getFruit(item: T) {
    println("과일: $item")
}

//fun main() {
//    getFruit(Apple())  // OK
////    getFruit(Book())   // ❌ 에러
//    printList(listOf(1, "Hello", 3.5))
//}

fun printList(list: List<*>) {
    list.forEach { println(it) }
}


class Pair<K, V>(val key: K, val value: V)

fun main(){
    val pair = Pair("이름", "Hood")
    println(pair.key)   // 이름
    println(pair.value) // Hood
}