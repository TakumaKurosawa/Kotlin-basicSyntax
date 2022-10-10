package advanced.scopedFunction

/**
 * with関数
 * 複数の処理をまとめて行う
 * 第一引数： レシーバーとなるオブジェクト
 * 第二引数： レシーバーのオブジェクトを処理し、任意の型を返す関数
 */
fun main() {
    val oddNumbers = with(mutableListOf<Int>()) {
        for (i in 1..10) {
            if (i % 2 == 1) {
                add(i)
            }
        }
        this
    }
    println(oddNumbers)
}
