package basic

data class Student(
    val name: String,
    val english: Int,
    val math: Int
) : Comparable<Student> {
    override fun compareTo(other: Student): Int {
        val byEnglish = other.english.compareTo(this.english)
        if (byEnglish != 0) return byEnglish

        return other.math.compareTo(this.math)
    }
}

fun main(){
    val student = listOf(
        Student("A", 90, 80),
        Student("B", 100, 70),
        Student("C", 85, 100)
    )

    val sorted = student.sorted()

    val comp = compareByDescending<Student> { it.english }
        .thenByDescending { it.math }

    val sortedComp = student.sortedWith(comp)

    sorted.forEach { println(it) }
    sortedComp.forEach { println(it) }
}
