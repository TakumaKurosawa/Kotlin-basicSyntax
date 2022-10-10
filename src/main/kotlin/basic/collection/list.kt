package basic.collection

fun main() {
    /**
     * listOf
     * 変更不可（immutable）
     */
    val list: List<Int> = listOf<Int>(1, 2, 3, 4, 5)
    println(list)
    println(list[2])

    // ショートハンド
    val listShortHand = listOf("this", "is", "shorthand")
    println(listShortHand)

    /**
     * mutableListOf
     * 変更可能（mutable）
     */
    val mutableList: MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5)
    mutableList.add(6)
    println(mutableList)
    mutableList.removeAt(0)
    println(mutableList.size)
}
