package AandI.`2week`

fun solution(osName: String) : String {
    return when(osName) {
        "Windows", "Linux", "MacOS" -> "DESKTOP"
        "Android", "iOS" -> "MOBILE"
        else -> "UNKNOWN"
    }
}

fun main() {
    print(solution("Windows"))
}