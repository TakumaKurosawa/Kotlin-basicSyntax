package collection

fun main() {
    /**
     * mapOf
     * 変更不可（immutable）
     */
    val immutableMap: Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(immutableMap)
    println(immutableMap["one"])

    // ショートハンド
    val immutableMapShortHand = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(immutableMapShortHand)

    /**
     * mutableMapOf
     * 変更可能（mutable）
     */
    val mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
    println(mutableMap)
    mutableMap["four"] = 4
    println(mutableMap)
    println(mutableMap.containsKey("five"))
}
