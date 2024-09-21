package CS.dataStructure

fun main() {
    val deque = ArrayDeque<Char>()
    deque.addFirst('A')
    println(deque)
    deque.add('B')
    println(deque)
    deque.add('C')
    println(deque)
    deque.add('D')
    println(deque)
    deque.add('E')
    println(deque)
    deque.addLast('F')
    println(deque)
    deque.removeFirst()
    println(deque)
    deque.removeLast()
    println(deque)
}

