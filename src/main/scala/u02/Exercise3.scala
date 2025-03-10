package u02

object Exercise3 extends App :
  def power(base: Double, exponent: Int): Double = exponent match
    case x if x == 0 => 1
    case _ => base * power(base, exponent - 1)
