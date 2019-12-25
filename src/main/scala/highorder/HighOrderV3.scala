package highorder

object HighOrderV3 {
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int) = sum(x => x, a, b)
  def sumPow(a: Int, b: Int) = sum(x => x * x, a, b)
}
