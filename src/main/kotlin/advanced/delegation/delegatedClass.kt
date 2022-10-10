package advanced.delegation

interface CalculationExecutor {
    val message: String
    fun calc(num1: Int, num2: Int): Int
    fun PrintStartMessage()
}

class CommonCalculationExecutor(override val message: String = "calc") : CalculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalStateException("not implemented")
    }

    override fun PrintStartMessage() {
        println("start $message")
    }
}

/**
 * デリゲーション（委譲）
 * インターフェースを実装したクラスを別のクラスに委譲することができる
 * byキーワードを使う
 */
class AddCalculationExecutorDelegated(private val calculationExecutor: CalculationExecutor) :
    CalculationExecutor by calculationExecutor {
    // calc() はCommonCalculationExecutorに実装がないため、Overrideする必要がある
    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

fun main() {
    val executorDelegated = AddCalculationExecutorDelegated(CommonCalculationExecutor())
    executorDelegated.PrintStartMessage()
    println(executorDelegated.calc(1, 2))
}
