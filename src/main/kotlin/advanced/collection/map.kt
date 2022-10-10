package advanced.collection

/**
 * map
 * 要素を別の形に変換したListを生成する
 */
fun main() {
    val list = listOf(1, 2, 3)
    val newList = list.map { it * 2 }
    println(newList)
}
