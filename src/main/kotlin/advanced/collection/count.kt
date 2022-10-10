package advanced.collection

fun main() {
    val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    /**
     * count
     * 条件に合う要素の数を返す
     */
    val oddNumberCount = list.count { it % 2 == 1 }
    println(oddNumberCount)
}
