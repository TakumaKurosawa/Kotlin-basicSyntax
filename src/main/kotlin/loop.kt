fun main() {
    /**
     * 繰り返し - while
     */
    var i = 1
    while (i < 10) {
        println("i is $i")
        i++
    }

    println()

    /**
     * 繰り返し - for-in
     */
    for (j in 1..10) {
        println("j is $j")
    }

    println()

    /**
     * 繰り返し - for-in
     * 配列の要素を順番に取り出す
     */
    val array = arrayOf(1, 2, 3, 4, 5)
    for (element in array) {
        println("element is $element")
    }

    println()

    /**
     * 繰り返し - for-until-step
     * 他の言語でいうところの・・・
     * for (int i = 0; i < 10; i ++)
     */
    for (k in 1 until 10 step 1) {
        println("k is $k")
    }
}
