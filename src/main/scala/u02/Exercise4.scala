package u02

object Exercise4 extends App :

  case class Literal(a: Int)
  
  case class Add(left: Literal, right: Literal)
  
  case class Multiply(left: Literal, right: Literal)
  
  def eval(expr: Any): Int = expr match {
    case Literal(value) => value
    case Add(left, right) => eval(left) + eval(right)
    case Multiply(left, right) => eval(left) * eval(right)
    case _ => throw new IllegalArgumentException("Invalid expression")
  }
