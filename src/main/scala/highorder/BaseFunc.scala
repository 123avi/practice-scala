package highorder

object BaseFunc {
  def pow2(x: Int): Int = x * x
  def factorial(i: Int): Int = {
    if (i == 0) 1 else i * factorial(i -1 )
  }

}
