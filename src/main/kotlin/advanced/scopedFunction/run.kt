package advanced.scopedFunction

data class User(var name: String)

/**
 * run関数
 * Nullableなオブジェクトに複数の処理をまとめて行う
 * withと異なり、レシーバーオブジェクトに対しての拡張関数として実装する
 */
fun userToString(user: User?, newName: String): String? {
    return user?.run {
        name = newName
        toString()
    }
}

fun main() {
    val nullUser = null
    println(userToString(nullUser, "Taro"))

    val user = User("Jiro")
    println(userToString(user, "Saburo"))
}
