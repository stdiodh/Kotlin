package CS.timeComplexity

fun printNames(names: List<String>) {
    for (name in names) {
        println(name)
    }
}

fun main(){
    println(printNames(listOf("James", "Amy", "Kotlin", "Python")))
}

