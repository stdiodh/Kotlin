package CS.dataStructure

import java.util.*

fun main() {
    val stack = Stack<Char>()
    stack.push('A')
    println(stack)
    stack.push('B')
    println(stack)
    stack.push('C')
    println(stack)
    stack.push('D')
    println(stack)
    stack.push('E')
    println(stack)
    stack.pop()
    println(stack)
}

