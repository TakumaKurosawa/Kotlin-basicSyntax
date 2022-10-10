package advanced

/**
 * アクセサメソッド（getter/setter）は暗黙的に自動生成される
 * ただし、valで定義した場合はgetterのみ、varで定義した場合はgetter/setter両方が自動生成される
 */
class User {
    var name: String = "default"
    var age: Int = 0

    /**
     * 自前で用意しようとするとコンパイルエラーになる。
    fun getName(): String {
    return this.name
    }
    fun setAge(age: Int) {
    this.age = age
    }
     */

    /**
     * 拡張プロパティ
     * getter/setterの処理を拡張できる
     */
    val isValidName: Boolean
        get() = this.name.length > 3
    var job: String = ""
        set(value) {
            if (value == "") {
                field = "default job" // field = this.job
            } else {
                field = value
            }
        }
}

fun main() {
    val user = User()
    user.name = "Taro"
    user.age = 20
    println(user.name)
    println(user.age)

    println(user.isValidName)
    user.name = ""
    println(user.isValidName)
    user.job = "programmer"
    println(user.job)
    user.job = ""
    println(user.job)
}
