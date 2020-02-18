import calculator.Lexer
import calculator.Node
import calculator.Parser
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.StringReader
import java.lang.AssertionError

class CalculatorTest {
    private fun parseExpression(str: String): Node {
        val lexer = Lexer(StringReader(str))
        val parser = Parser(lexer)
        return parser.expression{}
    }

    @Test
    fun `Empty input`() {
        try {
            parseExpression("")
        } catch (e: Exception) {
            return
        }
        throw AssertionError()
    }

    /* PARENTHESIS */

    @Test
    fun `Unclosed parenthesis`() {
        try {
            parseExpression("(1")
        } catch (e: Exception) {
            return
        }
        throw AssertionError()
    }

    @Test
    fun `Invalid parenthesis`() {
        try {
            parseExpression("1 (+) 2")
        } catch (e: Exception) {
            return
        }
        throw AssertionError()
    }

    @Test
    fun `Unnecessary parenthesis`() {
        val expression = "1 + (2)"
        val result = "1 + ( 2 )"
        val expr = parseExpression(expression)
        assertEquals(result, expr.getExpressionString())
        assertEquals(3, expr.value)
    }

    @Test
    fun `Incomplete expression`() {
        try {
            parseExpression("1 +")
        } catch (e: Exception) {
            return
        }

        throw AssertionError()
    }

    /* VARIABLES */

    @Test
    fun `Missing operation`() {
        try {
            parseExpression("100 1")
        } catch (e: Exception) {
            return
        }

        throw AssertionError()
    }

    /* OPERATIONS */

    @Test
    fun `Values missing`() {
        try {
            parseExpression("+ * / -")
        } catch (e: Exception) {
            return
        }
    }

    @Test
    fun Zero() {
        val expression = "0"
        val expr = parseExpression(expression)
        assertEquals(expression, expr.getExpressionString())
        assertEquals(0, expr.value)
    }

    @Test
    fun `Simple plus`() {
        val expression = "100 + 50"
        val expr = parseExpression(expression)
        assertEquals(expression, expr.getExpressionString())
        assertEquals(150, expr.value)
    }

    @Test
    fun `Simple minus`() {
        val expression = "100 - 50"
        val expr = parseExpression(expression)
        assertEquals(expression, expr.getExpressionString())
        assertEquals(50, expr.value)
    }

    @Test
    fun `Simple multiply`() {
        val expression = "100 * 50"
        val expr = parseExpression(expression)
        assertEquals(expression, expr.getExpressionString())
        assertEquals(5000, expr.value)
    }

    @Test
    fun `Simple divide`() {
        val expression = "100 / 50"
        val expr = parseExpression(expression)
        assertEquals(expression, expr.getExpressionString())
        assertEquals(2, expr.value)
    }

    @Test
    fun `Plus or minus and multiply priority`() {
        assertEquals(-50, parseExpression("50 - 2 * 50").value)
        assertEquals(150, parseExpression("50 + 2 * 50").value)
    }

    @Test
    fun `Plus or minus and divide priority`() {
        assertEquals(52, parseExpression("50 + 100 / 50").value)
        assertEquals(48, parseExpression("50 - 100 / 50").value)
    }

    @Test
    fun `Multiply and divide equal priority`() {
        assertEquals(1666, parseExpression("50 * 100 / 3").value) // 1650
        assertEquals(80, parseExpression("50 / 3 * 5").value) // 3
    }

    @Test
    fun `Correct input`() {
        val input = "180 + 93 * 666 - 48 / 4 / 3 - (16 * 3)"
        assertEquals(62066, parseExpression(input).value)
    }

    @Test
    fun `Print a tree`() {
        val input = "180 + 93 * 666 - 48 / 4 / 3 - (16 * 3)"
        parseExpression(input).printTree()
    }

}