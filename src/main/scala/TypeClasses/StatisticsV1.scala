package TypeClasses

object StatisticsV1 {
    import MyMath.Num
    def mean[T](xs: Vector[T])(implicit ev: Num[T]): T =
      ev.divide(xs.reduce(ev.plus), xs.size)
}
