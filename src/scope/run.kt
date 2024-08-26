package scope

//class Book(var name : String, var price: Int){
//    fun discount() {
//        price -= 5000
//    }
//}
//
//fun main() {
//    val a = Book("Kotlin의 모험", 30000).apply{
//        name = "[세일중] $name"
//        discount()
//    }
//
//    println("상품명 : ${a.name}, 가격 : ${a.price}")
//
//    val bookCost = a.run {
//        price + 5000
//    }
//    println("원가는 $bookCost!")
//}