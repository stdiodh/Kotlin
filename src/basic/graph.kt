package basic

data class Edge(val to: Int, val w: Int)

fun main() {
    val n = 3
    val graph = ArrayList<ArrayList<Edge>>(n+1).apply {
        repeat(n+1) { add(ArrayList()) }
    }

    fun addEdge(from: Int, to: Int, w: Int) {
        graph[from].add(Edge(to, w))
    }

    addEdge(1, 2, 4)
    addEdge(2, 1, 10)
    addEdge(1, 3, 7)
    addEdge(3, 2, 6)

    for (i in 1..n) {
        println("$i ->" + graph[i].joinToString { "${it.to}, ${it.w}"} )
    }
}