package u02

object Exercise2 extends App :
  def positive(x: Integer): String = x match
    case x if x >= 0 => "Positive"
    case _ => "Negative"

  val positiveVal: Int => String = (x: Int) => x match
    case x if x > 0 => "Positive"
    case 0 => "Negative"
