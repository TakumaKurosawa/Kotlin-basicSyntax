package advanced

data class User5(val id: Int, var name: String = "Kotlin", var age: Int = 10)

fun printUserInfo(id: Int, name: String = "Taro", age: Int = 20) {
    println("id: $id, name: $name, age: $age")
}

fun main() {
    // デフォルト引数が設定されていないものについては渡してあげる必要がある（コンパイルエラー）
    println(printUserInfo(1))

    // 名前付き引数
    println(printUserInfo(id = 1, age = 30, name = "Jiro"))

    val user = User5(1)
    val user2 = User5(id = 2, age = 3, name = "Jiro")
    println(user)
    println(user2)
}
