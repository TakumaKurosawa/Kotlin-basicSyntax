package advanced.delegation

import kotlin.reflect.KProperty

/**
 * 各プロパティごとにget()とset()を実装するのは冗長である。
 */
class Person {
    var name: String = ""
        get() {
            println("get name")
            return field
        }
        set(value) {
            println("set name")
            field = value
        }
    var address: String = ""
        get() {
            println("get address")
            return field
        }
        set(value) {
            println("set address")
            field = value
        }
}

/**
 * 委譲先となるクラス
 * プロパティのget()とset()を実装することでプロパティの委譲を行う
 */
class DelegateWithMessage<T> {
    private var value: T? = null

    /**
     * thisRef: 委譲元のオブジェクト
     * KProperty<*>: 委譲元のプロパティ情報を持っている
     */
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        println("thisRef: $thisRef")
        println("get ${property.name}")
        return value!!
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        println("set ${property.name}")
        this.value = value
    }
}

class DelegatePerson {
    // byを使って委譲先を指定する
    var name: String by DelegateWithMessage()
    var address: String by DelegateWithMessage()
}

fun main() {
    val delegatePerson = DelegatePerson()
    delegatePerson.name = "Taro"
    delegatePerson.address = "Tokyo"
    println(delegatePerson.name)
    println(delegatePerson.address)
}
