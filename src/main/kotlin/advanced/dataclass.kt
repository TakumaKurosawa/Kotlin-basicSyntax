package advanced

/**
このクラスは、以下のメソッドを自動生成してくれる
- アクセサ（getter/setter）
- toString
- equals
- hashCode
- copy
- component1, component2, ...
 */
data class User4(val id: Int, var name: String)

fun main() {
    println("// getter/setter")
    val user = User4(1, "Taro")
    println(user)
    user.name = "Jiro"
    println(user)

    println("// equalsの結果")
    val user2 = User4(2, "Jiro")
    println(user == user2)
    val user3 = User4(2, "Jiro")

    println("// hashSetの値")
    println("user = ${user.hashCode()}")
    println("user2 = ${user2.hashCode()}")
    println("user3 = ${user3.hashCode()}")

    println("// hashSetでの比較結果")
    val hashSetOfUser2 = hashSetOf(user2)
    println(hashSetOfUser2.contains(user))
    println(hashSetOfUser2.contains(user3))

    /**
     * componentNメソッド
     * プロパティの値を取得できる
     * ※個人的にはあまり使うタイミングなさそうと思った
     */
    println("// componentNメソッド")
    println(user.component1())
    println(user.component2())

    /**
     * copyメソッド
     * プロパティの値をコピーした新しいインスタンスを生成する
     */
    println("// copyメソッド")
    val updatedUser = user.copy(1, "Saburo")
    println(updatedUser)
}
