package rk.powermilk

import java.math.BigInteger

/**
 * Exception message.
 */
internal const val MESSAGE = "The number should be greater to 0"

/**
 * Function creates a string with Fibonacci series steps.
 *
 * @param number number to calculate Fibonacci series.
 * @return string with Fibonacci series steps for 0 to [number].
 */
fun printFibonacciSeries(number: Int) =
    IntRange(0, number).map { fibonacci(it).toString() }.joinToString { it }

/**
 * Function to calculate Fibonacci number for n ([number]).
 *
 * @param number from Fibonacci series.
 * @return Fibonacci number.
 * @exception ArithmeticException when [number] is negative number.
 */
tailrec fun fibonacci(
    number: Int, first: BigInteger = BigInteger.ZERO, second: BigInteger = BigInteger.ONE
): BigInteger = if (number < 0)
    throw ArithmeticException(MESSAGE)
else when (number) {
    0 -> first
    1 -> second
    else -> fibonacci(number - 1, second, first + second)
}
