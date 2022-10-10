package advanced.scopedFunction

data class User4(val id: Int, var name: String, var address: String)

fun getUser4(id: Int): User4 {
    return User4(id, "Taro", "Tokyo")
}

/**
 * also関数
 * オブジェクトに変更を加えて返す（名前付き）
 */
fun updateUser4(id: Int, newName: String, newAddress: String): User4 {
    return getUser4(id).also { u ->
        u.name = newName
        u.address = newAddress
    }
    // it = 暗黙的につけられる名前
    // return getUser4(id).also {
    //     it.name = newName
    //     it.address = newAddress
    // }
}

fun main() {
    println(updateUser4(2, "Jiro", "Osaka"))
}
