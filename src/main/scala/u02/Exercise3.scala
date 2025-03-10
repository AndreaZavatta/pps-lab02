package u02

import scala.annotation.tailrec

object Exercise3 extends App :
  def power(base: Double, exponent: Int): Double = exponent match
    case x if x == 0 => 1
    case _ => base * power(base, exponent - 1)

  def powerTail(base: Double, exponent: Int): Double = {
    @tailrec
    def helper(base: Double, exponent: Int, acc: Double): Double = exponent match
      case 0 => acc
      case _ if exponent > 0 => helper(base, exponent - 1, acc * base)
      case _ => helper(base, exponent + 1, acc / base)

    helper(base, exponent, 1.0)
  }