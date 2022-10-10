package advanced.scopedFunction

data class User3(val id: Int, var name: String, var address: String)

fun getUser(id: Int): User3 {
    return User3(id, "Taro", "Tokyo")
}

/**
 * apply関数
 * オブジェクトに変更を加えて返す
 */
fun updateUser(id: Int, newName: String, newAddress: String): User3 {
    return getUser(id).apply {
        name = newName
        address = newAddress
    }
}

fun main() {
    println(updateUser(1, "Jiro", "Osaka"))
}
