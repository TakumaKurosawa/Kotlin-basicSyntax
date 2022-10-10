package advanced.collection

/**
 * distinct
 * 重複した要素を除いたListを生成する
 */
fun main() {
    val list = listOf(1, 1, 2, 3, 4, 5, 5)
    list.distinct().forEach { println(it) }
}
