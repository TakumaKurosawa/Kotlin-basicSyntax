package advanced.collection

data class User(val id: Int, var teamId: Int, var name: String)

/**
 * filter
 * 条件に合う要素のみを抽出したListを生成する
 * list.filter { 条件式 }
 */
fun main() {
    val users = listOf(
        User(1, 1, "Taro"),
        User(2, 2, "Jiro"),
        User(3, 1, "Saburo"),
        User(4, 2, "Shiro"),
        User(5, 1, "Goro"),
    )

    val team1Users = users.filter { it.teamId == 1 }
    team1Users.forEach { println(it) }
}
