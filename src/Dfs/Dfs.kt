package Dfs

fun main(){
    val graph = listOf(
        emptyList(),
        listOf(2, 3, 8),
        listOf(1, 7),
        listOf(1, 4, 5),
        listOf(3, 5),
        listOf(3, 4),
        listOf(7),
        listOf(2, 6, 8),
        listOf(1, 7)
    )

    val visited = BooleanArray(9) { false }

    fun dfs(graph : List<List<Int>>, node : Int, visit : BooleanArray){
        visited[node] = true
        print("$node ")

        for (i in graph[node]){
            if(!visit[i]){
                dfs(graph, i, visit)
            }
        }
    }

    dfs(graph, 1, visited)
}