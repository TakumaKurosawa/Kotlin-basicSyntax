package collection

fun main() {
    /**
     * setOf
     * 変更不可（immutable）
     */
    val immutableSet: Set<Int> = setOf<Int>(1, 2, 3, 4, 5)
    println(immutableSet)
    println(immutableSet.contains(1))

    // ショートハンド
    val immutableSetShortHand = setOf("this", "is", "shorthand")
    println(immutableSetShortHand)

    /**
     * mutableSetOf
     * 変更可能（mutable）
     */
    val mutableSet: MutableSet<Int> = mutableSetOf<Int>(1, 2, 3, 4, 5)
    mutableSet.add(6)
    println(mutableSet)
    mutableSet.remove(1)
    println(mutableSet.size)
}
