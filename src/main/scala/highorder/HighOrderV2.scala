package highorder
import BaseFunc._
object HighOrderV2 {
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def id(x: Int): Int = x
  def sumInts(a: Int, b: Int) = sum(id, a, b)
  def sumCubes(a: Int, b: Int) = sum(pow2, a, b)
  def sumFactorials(a: Int, b: Int) = sum(factorial, a, b)

}
