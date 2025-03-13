package u02

import u02.Exercise4.{Add, Expr, Literal, Multiply}

object Exercise4 extends App :

  case class Literal(a: Int)

  case class Add(left: Expr, right: Expr)

  case class Multiply(left: Expr, right: Expr)

  type Expr = Literal | Add | Multiply
  def eval(expr: Expr): Int = expr match {
    case Literal(value) => value
    case Add(left, right) => eval(left) + eval(right)
    case Multiply(left, right) => eval(left) * eval(right)
    case _ => throw new IllegalArgumentException("Invalid expression")
  }

object OperationOnExpression extends App:

  def evaluate(expr: Expr): Int = expr match
    case Literal(value) => value
    case Add(left, right) => evaluate(left) + evaluate(right)
    case Multiply(left, right) => evaluate(left) * evaluate(right)

  def show(expr: Expr): String = expr match
    case Literal(value) => value.toString
    case Add(left, right) => "("+show(left)+" + "+show(right) +")"
    case Multiply(left, right) => "("+show(left)+" * "+show(right) +")"