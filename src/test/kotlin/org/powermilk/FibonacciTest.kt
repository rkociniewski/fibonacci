package org.powermilk

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import java.math.BigInteger
import kotlin.test.assertEquals

@Suppress("UnusedPrivateMember")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciTest {
    @ParameterizedTest(name = "[{index}] should throws ArithmeticException for {0}")
    @ValueSource(ints = [-2, -1])
    fun `should throws ArithmeticException - negative number as input`(expected: Int) =
        assertEquals(MESSAGE, assertThrows<ArithmeticException> { fibonacci(expected) }.message)

    @ParameterizedTest(name = "should return \"{1}\" for terms \"{0}\"")
    @MethodSource("calculateFibonacciProvider")
    @DisplayName("should calculate Fibonacci number")
    fun `should calculate Fibonacci number`(number: Int, expected: BigInteger) =
        assertEquals(expected, fibonacci(number))

    @ParameterizedTest(name = "should display \"{1}\" for terms \"{0}\"")
    @MethodSource("printFibonacciProvider")
    fun `should display Fibonacci series`(number: Int, expected: String) =
        assertEquals(expected, printFibonacciSeries(number))

    private fun calculateFibonacciProvider() = listOf(
        Arguments.of(0, BigInteger.ZERO),
        Arguments.of(1, BigInteger.ONE),
        Arguments.of(2, BigInteger.ONE),
        Arguments.of(6, BigInteger("8")),
        Arguments.of(64, BigInteger("10610209857723"))
    )

    private fun printFibonacciProvider() = listOf(
        Arguments.of(-1, ""),
        Arguments.of(1, "0, 1"),
        Arguments.of(2, "0, 1, 1"),
        Arguments.of(6, "0, 1, 1, 2, 3, 5, 8"),
        Arguments.of(12, "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144"),
    )
}
