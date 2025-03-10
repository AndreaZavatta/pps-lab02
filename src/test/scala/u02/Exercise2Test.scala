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

  @Test def testLessThanNonCurried(): Unit =
    assertTrue(lessThanNonCurried(3, 4, true))
    assertTrue(lessThanNonCurried(4, 3, false))

  @Test def testLessThanCurried(): Unit =
    assertTrue(lessThanCurried(3)(4)(true))
    assertTrue(lessThanCurried(4)(3)(false))

  @Test def testLessThanCurriedVal(): Unit =
    assertTrue(lessThanCurriedVal(3)(4)(true))
    assertTrue(lessThanCurriedVal(4)(3)(false))