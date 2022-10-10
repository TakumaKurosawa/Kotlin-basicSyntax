package advanced

class User2 {
    val id: Int = 1
    var name: String = "Taro"
}

/**
 * overrideすることで、toString, equals, hashCodeメソッドをオーバーライドできる
 */
class User3 {
    val id: Int = 1
    var name: String = "Taro"

    override fun toString(): String {
        return "User(id=$id, name='$name')"
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode() // 一意になれば、ロジックは何でも良い
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User3

        if (id != other.id) return false
        if (name != other.name) return false

        return true
    }
}

fun main() {
    val userA = User2()
    val userB = User2()

    println("// toString関数の結果")
    println(userA.toString())
    println(userB.toString())

    println("// hashCode関数の結果")
    println(userA.hashCode())
    println(userB.hashCode())

    println("// ==演算子の結果")
    println(userA == userB) // userA equals userBとも書ける（非推奨）

    println("// hashSetでの比較結果")
    val hashSetOfA = hashSetOf(userA)
    println(hashSetOfA.contains(userB))

    println("--------------------")

    val userC = User3()
    val userD = User3()

    println("// toString関数の結果")
    println(userC.toString())
    println(userD.toString())

    println("// hashCode関数の結果")
    println(userC.hashCode())
    println(userD.hashCode())

    println("// ==演算子の結果")
    println(userC == userD) // userA equals userBとも書ける（非推奨）

    println("// hashSetでの比較結果")
    val hashSetOfC = hashSetOf(userC)
    println(hashSetOfC.contains(userD))
}

