package function

fun main() {
    val a : List<Int> = listOf(1, 2, 3, 4, 5, 6)

    if (a.any { it % 2 == 0 }) {
        println("짝수 데이터가 존재합니다.")
    }

    if (a.all { it % 2 == 0 }){
        println("모든 데이터가 짝수 입니다!")
    } else {
        println("홀수 데이터도 존제합니다.")
    }

    if (a.none { it > 7 } ){
        println("7보다 큰 데이터는 없습니다. ")
    }
}