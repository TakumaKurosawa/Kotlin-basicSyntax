fun main() {
    val english = EnglishGreeter()
    english.sayHello()

    val japanese = JapaneseGreeter()
    japanese.sayHello()
}

/**
 * インターフェース定義
 * インターフェースは、抽象メソッドのみを定義できる
 */
interface Greeter {
    fun sayHello()
}

/**
 * 実装側のクラスは、インターフェースの抽象メソッドを実装する必要がある
 */
class EnglishGreeter : Greeter {
    override fun sayHello() {
        println("Hello")
    }
}
class JapaneseGreeter : Greeter {
    override fun sayHello() {
        println("こんにちは")
    }
}
