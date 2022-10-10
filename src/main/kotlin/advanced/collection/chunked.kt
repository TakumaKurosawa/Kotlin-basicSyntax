package advanced.collection

fun main() {
    val list = listOf<String>("Java", "Kotlin", "Python", "Ruby", "Go")

    /**
     * chunked
     * 指定したサイズで分割する
     */
    val chunkedList = list.chunked(2)
    chunkedList.forEach { println(it) }
}
