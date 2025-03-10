package u02

import org.junit.*
import org.junit.Assert.*
import Exercise2.*

class Exercise2Test:

  @Test def testPositiveFun(): Unit =
    assertEquals("Positive",positive(20))

  @Test def testPositiveVal(): Unit =
    assertEquals("Positive", positiveVal(20))
