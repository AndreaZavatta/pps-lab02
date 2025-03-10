package u02

object Exercise2 extends App :
  def positive(x: Integer): String = x match
    case x if x >= 0 => "Positive"
    case _ => "Negative"

  val positiveVal: Int => String = _ match
    case x if x > 0 => "Positive"
    case 0 => "Negative"

  def neg(fun: String => Boolean): String => Boolean = !fun(_)

  val negVal: (String => Boolean ) => ( String => Boolean ) = f => !f(_)

  def genericNeg[X](fun: X => Boolean): (X => Boolean) = !fun(_)

  def lessThanNonCurried: (Int, Int, Boolean) => Boolean = _ <= _ == _

  def lessThanCurried(x: Int) (y: Int) (z: Boolean): Boolean = x <= y == z

  val lessThanCurriedVal: Int => Int => Boolean => Boolean = x => y => z => (x <= y) == z

  val lessThanNonCurriedVal: (Int, Int, Boolean) => Boolean = _ <= _ == _

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  def composeGeneric[A, B, C](f: B => C, g: A => B): A => C = x => f(g(x))
  
  def composeThree[A,B,C,D](f: C => D, g: B => C, h: A => B): A => D = x => f(g(h(x)))

  def composeThreeWithComposeGeneric[A, B, C, D](f: C => D, g: B => C, h: A => B): A => D = x => f(composeGeneric(g, h)(x))

