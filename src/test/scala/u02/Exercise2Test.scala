package u02

import org.junit.*
import org.junit.Assert.*
import Exercise2.*

class Exercise2Test:

  @Test def testPositiveFun(): Unit =
    assertEquals("Positive",positive(20))

  @Test def testPositiveVal(): Unit =
    assertEquals("Positive", positiveVal(20))

  @Test def testNegFun(): Unit =
    val isEmpty: (String   => Boolean ) = str => str.isEmpty
    val isFull = neg(isEmpty)
    assertTrue(isFull("test"))
    assertFalse(isEmpty("test"))

  @Test def testNegVal(): Unit =
    val isEmpty: (String   => Boolean ) = str => str.isEmpty
    val isFull = negVal(isEmpty)
    assertTrue(isFull("test"))
    assertFalse(isEmpty("test"))

  @Test def testGenericNeg(): Unit =
    val isEmpty: (String => Boolean) = str => str.isEmpty
    val isFull = genericNeg[String](isEmpty)
    assertTrue(isFull("test"))
    assertFalse(isEmpty("test"))