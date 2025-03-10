package u02

import org.junit.*
import org.junit.Assert.*
import Currying.*

class CurryingTest:

  @Test def testDevideWithNoCurrying(): Unit =
    val delta = 0.0001
    assertEquals(10, divide(20.0,2.0), delta)

  @Test def testDevideWithCurrying(): Unit =
    val delta = 0.0001
    assertEquals(10, curriedDivide(20.0)(2.0), delta)

  @Test def testDevideWithCurrying2(): Unit = {
    val delta = 0.0001
    val curriedDivide20 = curriedDivide(20.0)
    assertEquals(10, curriedDivide20(2.0), delta)
  }

  @Test def testMultWithNoCurrying(): Unit =
    val delta = 0.0001
    assertEquals(40.0, mult(20.0, 2.0), delta)

  @Test def testMultWithCurrying(): Unit =
    val delta = 0.0001
    assertEquals(40.0, curriedMult(20.0)(2.0), delta)

  @Test def testMultWithCurrying2(): Unit = {
    val delta = 0.0001
    val curriedMult20 = curriedMult(20.0)
    assertEquals(40.0, curriedMult20(2.0), delta)
  }
