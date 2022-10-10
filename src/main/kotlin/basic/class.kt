package basic

fun main() {
    val person = Person()
    person.sayName("John")

    val personWithConstructor = PersonWithConstructor("Alice")
    personWithConstructor.sayName()

    val dog = Dog()
    dog.cry()

    val fileA = FileA()
    fileA.openFile()
}

/**
 * クラス定義
 */
class Person {
    fun sayName(name: String) {
        println("Hello, my name is $name")
    }
}

/**
 * コンストラクターの定義
 * コンストラクターがない場合、 `()` を省略可能
 */
class PersonWithConstructor(private val name: String) {
    fun sayName() {
        println("Hello, my name is $name")
    }
}

/**
 * 継承 - open
 * 継承させたいクラス及び関数には `open` をつける
 * ファイルを跨いで継承可能
 */
open class Animal {
    open fun cry() = println("---")
}

class Dog : Animal() {
    override fun cry() = println("Bow-wow")
}

/**
 * 継承 - sealed
 * 同一ファイル内のみに継承を制限したい場合
 * abstract method: 抽象メソッド。継承先で実装を強制する
 */
sealed class SameFile {
    abstract fun openFile() // openFile() の実装を強制する
}

class FileA : SameFile() {
    override fun openFile() = println("Open File A") // overrideしていないとコンパイルエラー
}
