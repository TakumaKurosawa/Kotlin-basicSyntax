package advanced.collection

fun main() {
    val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    /**
     * reduce
     * 畳み込み演算を行う
     * 1 + 2 = 3
     * 3 + 3 = 6
     * 6 + 4 = 10
     * 10 + 5 = 15
     * 15 + 6 = 21
     * 21 + 7 = 28
     * 28 + 8 = 36
     * 36 + 9 = 45
     * 45 + 10 = 55
     */
    val sum = list.reduce { acc, i -> acc + i } // acc: 現在までに処理された合算の結果、 i: 現在処理中の要素
    println(sum)
}
