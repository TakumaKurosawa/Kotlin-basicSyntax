package advanced.collection

fun main() {
    val users = listOf(
        User(1, 100, "Taro"),
        User(2, 200, "Jiro"),
        User(3, 100, "Saburo"),
        User(4, 200, "Shiro"),
        User(5, 100, "Goro"),
    )

    val strs = listOf<String>("Go", "Java", "Kotlin", "Python", "Ruby")

    /**
     * associateBy
     * keyにしたいプロパティを指定する
     * it.idとすると、idの値をKeyとしてUserオブジェクトがValueとなる
     */
    val associateByUsers = users.associateBy { it.id }
    associateByUsers.forEach { println(it) }

    println("-----")

    /**
     * associateWith
     * valueにしたいプロパティを指定する
     */
    val associateWithStrs = strs.associateWith {
        it.length // 文字数
    }
    associateWithStrs.forEach { println(it) }
}
