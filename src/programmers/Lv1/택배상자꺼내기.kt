class Solution {
    fun solution(n: Int, w: Int, num: Int): Int {
        val rows = (n + w - 1) / w  // 올림 계산 (층 수)
        val warehouse = Array(rows) { IntArray(w) { 0 } }
        var currentNumber = 1
        var targetRow = 0
        var targetCol = 0

        // 창고 배열 생성
        for (i in 0 until rows) {
            if (i % 2 == 0) { // 왼쪽 → 오른쪽
                for (j in 0 until w) {
                    if (currentNumber > n) break
                    warehouse[i][j] = currentNumber
                    if (currentNumber == num) {
                        targetRow = i
                        targetCol = j
                    }
                    currentNumber++
                }
            } else { // 오른쪽 → 왼쪽
                for (j in w - 1 downTo 0) {
                    if (currentNumber > n) break
                    warehouse[i][j] = currentNumber
                    if (currentNumber == num) {
                        targetRow = i
                        targetCol = j
                    }
                    currentNumber++
                }
            }
        }

        // 자기 자신 포함, 위층에서 같은 위치의 상자 개수 세기
        var cnt = 0
        for (i in targetRow until rows) {
            if (warehouse[i][targetCol] != 0) {
                cnt++
            }
        }

        return cnt
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(22, 6, 8))
}
