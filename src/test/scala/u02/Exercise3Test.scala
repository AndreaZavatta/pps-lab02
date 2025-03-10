package u02

import org.junit.*
import org.junit.Assert.*
import Exercise3.*

class Exercise3Test:

  val bias = 0.00001
  @Test def testPowerRecursive(): Unit =
    assertEquals(27, power(3,3), bias)