package advanced.scopedFunction

data class User2(val name: String)

/**
 * let関数
 * Nullableなオブジェクトに名前をつけて複数の処理をまとめて行う
 */
fun createUser2(name: String?): User2? {
    return name?.let { n -> User2(n) }
    // it = 暗黙的につけられる名前
    // return name?.let { User2(it) }
}

fun main() {
    println(createUser2(null))
    println(createUser2("Taro"))
}
