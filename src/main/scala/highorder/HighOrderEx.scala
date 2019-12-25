package highorder

object HighOrderEx {

    def sumInts(a: Int, b: Int): Int =
      if (a > b) 0 else a + sumInts(a + 1, b)

    def sumPow(a: Int, b: Int): Int = ???

    def sumFactorials(a: Int, b: Int): Int = ???

}
