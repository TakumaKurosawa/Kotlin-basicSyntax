package basic

fun main() {
    /**
     * 変数
     * val: 定数宣言（immutable）
     * var: 変数宣言（mutable）
     */
    val id = 1 // valは変更不可
    var name = "Taro" // varは変更可能
    name = "Jiro"

    /**
     * 変数展開
     */
    println("id: $id, name: $name")
}
