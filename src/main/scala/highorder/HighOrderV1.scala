package highorder

import BaseFunc._

object HighOrderV1 extends App {


  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)

  def sumPow(a: Int, b: Int): Int =
    if (a > b) 0 else pow2(a) + sumPow(a + 1, b)

  def sumFactorials(a: Int, b: Int): Int =
    if (a > b) 0 else factorial(a) + sumFactorials(a + 1, b)

}
