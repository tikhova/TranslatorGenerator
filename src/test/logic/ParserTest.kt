import logic.Lexer
import logic.Node
import logic.Parser
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.StringReader
import java.lang.AssertionError

class ParserTest {
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
            parseExpression("(a")
        } catch (e: Exception) {
            return
        }
        throw AssertionError()
    }

    @Test
    fun `Invalid parenthesis`() {
        try {
            parseExpression("a (and) b")
        } catch (e: Exception) {
            return
        }
        throw AssertionError()
    }

    @Test
    fun `Unnecessary parenthesis`() {
        val expression = "not (a)"
        val result = "not ( a )"
        assertEquals(result, parseExpression(expression).getExpressionString())
    }

    @Test
    fun `Incomplete expression`() {
        try {
            parseExpression("a and")
        } catch (e: Exception) {
            return
        }

        throw AssertionError()
    }

    /* VARIABLES */

    @Test
    fun `Missing operation`() {
        try {
            parseExpression("a b")
        } catch (e: Exception) {
            return
        }

        throw AssertionError()
    }

    /* OPERATIONS */

    @Test
    fun `Variables missing`() {
        try {
            parseExpression("and or xor not")
        } catch (e: Exception) {
            return
        }

    }

    @Test
    fun `Simple not`() {
        val expression = "not a"
        val realResult = parseExpression(expression).getExpressionString()
        assertEquals(expression, realResult)
    }

    @Test
    fun `Simple and`() {
        val expression = "a and b"
        val realResult = parseExpression(expression).getExpressionString()
        assertEquals(expression, realResult)
    }

    @Test
    fun `Simple or`() {
        val expression = "a or b"
        val realResult = parseExpression(expression).getExpressionString()
        assertEquals(expression, realResult)
    }

    @Test
    fun `Simple xor`() {
        val expression = "a xor b"
        val realResult = parseExpression(expression).getExpressionString()
        assertEquals(expression, realResult)
    }

    @Test
    fun `Not and and priority`() {
        assertEquals(false, parseExpression("not false and false").value)
    }

    @Test
    fun `Not and or priority`() {
        assertEquals(true, parseExpression("not false or true").value)
    }

    @Test
    fun `And and or priority`() {
        assertEquals(true, parseExpression("false and true or true").value)
        assertEquals(true, parseExpression("true or true and false").value)
    }

    @Test
    fun `And and xor priority`() {
        assertEquals(true, parseExpression("false and true xor true").value)
        assertEquals(true, parseExpression("true xor true and false").value)
    }

    @Test
    fun `Or and xor priority equal`() {
        parseExpression("true or false xor true").printTree()
        assertEquals(true, parseExpression("true xor false or true").value)
        assertEquals(false, parseExpression("true or false xor true").value)
    }

    @Test
    fun `Correct input`() {
        val input = "a and not b or a xor not c"
        assertEquals(input, parseExpression(input).getExpressionString())
    }

    @Test
    fun `Print a tree`() {
        val input = "a and not b or a xor not c"
        parseExpression(input).printTree()
    }

}