package advanced.collection

fun main() {
    val users = listOf(
        User(1, 100, "Taro"),
        User(2, 200, "Jiro"),
        User(3, 100, "Saburo"),
        User(4, 200, "Shiro"),
        User(5, 100, "Goro"),
    )

    /**
     * groupBy
     * keyにしたいプロパティを指定する
     * it.idとすると、idの値をKeyとしてUserオブジェクトがValueとなる
     */
    val teamUsers = users.groupBy { it.teamId }
    teamUsers.forEach { println(it) }
}
