//package AandI.`2week`
//
//fun solution(logs: String): Array<String> {
//    val regex = """\[(ERROR|WARN)\]\s(\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2})\s(.*?)(?=,\s*\[|\]$|$)""".toRegex()
//
//    return regex.findAll(logs)
//        .map {
//            val timestamp = it.groupValues[2]
//            val message = it.groupValues[3].trim()
//            timestamp to message
//        }
//        .sortedByDescending { it.first }
//        .map { it.second }
//        .toList()
//        .toTypedArray()
//}
//
//fun main() {
//    val logs = "[[ERROR] 2024-01-01T00:00:01 e1, [ERROR] 2024-01-01T00:00:02 e2, [WARN] 2024-01-01T00:00:03 w1]"
//    print(solution(logs).contentToString())
//}