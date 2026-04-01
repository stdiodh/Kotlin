package AandI.`2week`

fun solution(branchName: String) : Boolean {
    val splitBranch = branchName.split("/")
    return (splitBranch[0] == "feature" || splitBranch[0] == "fix"
            || splitBranch[0] ==  "hotfix" || splitBranch[0] ==  "release"
            && splitBranch.size - 1 != 1)
}

fun main() {
    print(solution("feature/"))
}