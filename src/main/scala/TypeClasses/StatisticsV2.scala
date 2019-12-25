package TypeClasses

class StatisticsV2 {

  import MyMath.Num
  def mean[T: Num](xs: Vector[T])(implicit ev: Num[T]): T =
    ev.divide(xs.reduce(ev.plus(_, _)), xs.size)

  def median[T : Num](xs: Vector[T]): T =
    xs(xs.size / 2)

  def quartiles[T: Num](xs: Vector[T]): (T, T, T) =
    (xs(xs.size / 4), median(xs), xs(xs.size / 4 * 3))

  def iqr[T: Num](xs: Vector[T]): T = quartiles(xs) match {
    case (lowerQuartile, _, upperQuartile) =>
      implicitly[Num[T]].minus(upperQuartile, lowerQuartile)
  }
}