package u02

import scala.annotation.tailrec

object Exercise3 extends App :
  def power(base: Double, exponent: Int): Double = exponent match
    case x if x == 0 => 1
    case _ => base * power(base, exponent - 1)

  def powerTail(base: Double, exponent: Int): Double =
    @tailrec
    def helper(base: Double, exponent: Int, acc: Double): Double = exponent match
      case 0 => acc
      case _ if exponent > 0 => helper(base, exponent - 1, acc * base)
      case _ => helper(base, exponent + 1, acc / base)

    helper(base, exponent, 1.0)



  def reverseInteger(number: Integer): Integer =
    @tailrec
    def helper(number: Integer, acc: Integer): Integer = number match
      case 0  => acc
      case _ if number > 0 =>
        val lastDigit = number % 10
        val numberWithoutLastDigit = number / 10
        val numberToAdd = lastDigit * power(10, countDigits(number)-1).toInt
        helper(numberWithoutLastDigit, acc + numberToAdd)

    def countDigits(n: Int): Int =
      @tailrec
      def helper(num: Int, count: Int): Int =
        if (num == 0) count
        else helper(num / 10, count + 1)

      if (n == 0) 1 else helper(math.abs(n), 0)

    helper(number, 0)
