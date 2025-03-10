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

  def lessThanNonCurried(x: Int, y: Int, z: Boolean): Boolean = (x <= y) == z

  def lessThanCurried(x: Int) (y: Int) (z: Boolean): Boolean = (x <= y) == z
  
  val lessThanCurriedVal: Int => Int => Boolean => Boolean = x => y => z => (x <= y) == z
  
