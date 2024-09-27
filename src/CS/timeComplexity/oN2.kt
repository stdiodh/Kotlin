package CS.timeComplexity

fun main(){
    val numberList = arrayListOf<Int>()

    for(x in 1..5){
        numberList.add(x)
        for(y in 1..5){
            numberList.add(y)
        }
    }

    numberList.forEach { println(it) }
}

