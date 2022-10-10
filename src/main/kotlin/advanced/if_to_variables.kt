package advanced

/**
 * if(when) to variables
 * 条件式を変数に代入する
 */
fun main() {
    val id = 1
    val ifResult: String = if (id < 100) {
        "id less than 100"
    } else {
        "id more than 100"
    }
    println(ifResult)

    val whenResult: String = when (id) {
        1 -> "id is 1"
        2 -> "id is 2"
        else -> "id is not 1 or 2"
    }
    println(whenResult)

    println(returnIfResult(id))
}

/**
 * 関数の返り値として条件式の結果を返せる
 */
fun returnIfResult(id: Int): String {
    return if (id < 100) {
        "id less than 100"
    } else {
        "id more than 100"
    }
}
