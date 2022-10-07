fun main() {
    add(1, 2)
    addShortHand(1, 2)
}
/**
 * 関数
 * 戻り値の型は省略可能
 */
fun add(x: Int, y: Int): Int {
    return x + y
}

// returnも省略可能（JSっぽさを感じる）
fun addShortHand(x: Int, y: Int) = x + y
