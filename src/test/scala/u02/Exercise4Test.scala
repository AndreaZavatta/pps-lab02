package u02

import org.junit.*
import org.junit.Assert.*
import u02.Exercise4.*

class Exercise4Test:

  val bias = 0.00001
  @Test def testSumExpression(): Unit =
    assertEquals(7, eval(Add(Literal(3), Literal(4))))

  @Test def testMultiplyExpression(): Unit =
    assertEquals(12, eval(Multiply(Literal(3), Literal(4))))

  @Test def testMultiplyAndSumExpression(): Unit =
    assertEquals(11, eval(Add(Multiply(Literal(2), Literal(4)), Literal(3))))