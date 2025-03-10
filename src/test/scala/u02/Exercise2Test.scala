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

  @Test def testLessThanNonCurriedVal(): Unit =
    assertTrue(lessThanNonCurriedVal(3, 4, true))
    assertTrue(lessThanNonCurriedVal(4, 3, false))

  @Test def testComposition(): Unit =
    val sumOne: (Int => Int) = x => x + 1
    val multTwo: (Int => Int) = x => x * 2
    val composedFunction = compose(sumOne, multTwo)
    assertEquals(7, composedFunction(3))

  @Test def testCompositionGeneric(): Unit =
    val sumOne: (Int => Int) = x => x + 1
    val multTwo: (Int => Int) = x => x * 2
    val composedFunction = composeGeneric(sumOne, multTwo)
    assertEquals(7, composedFunction(3))

  @Test def testCompositionThree(): Unit =
    val sumOne: (Int => Int) = x => x + 1
    val multTwo: (Int => Int) = x => x * 2
    val divideTwo: (Int => Int) = x => x / 2
    val composedFunction = composeThree(multTwo, sumOne, divideTwo)
    assertEquals(12, composedFunction(10))