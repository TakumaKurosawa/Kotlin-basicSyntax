fun main() {
    val id = 1

    /**
     * 条件分岐 - if
     * 他の言語と同じ書き味
     */
    if (id < 100) {
        println("id is less than 100")
    } else if (id == 100) {
        println("id is 100")
    } else {
        println("id is greater than 100")
    }

    /**
     * 条件分岐 - when
     * 他の言語でいうと、switch文
     */
    when (id) {
        1 -> println("id is 1")
        2 -> println("id is 2")
        else -> println("id is not 1 or 2")
    }

    when {
        id < 100 -> println("id is less than 100")
        id == 100 -> println("id is 100")
        else -> println("id is greater than 100")
    }
}
