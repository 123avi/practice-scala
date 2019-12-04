package challenge

object Solutions {

  def compress[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case h::t => h::compress(t.dropWhile(_ == h))
  }

  def filter[A](list: List[A], f:A => Boolean): List[A] = list match {
    case Nil => Nil
    case h::t => if (f(h)) h::filter(t, f) else filter(t, f)
  }

  def filter2[A](list: List[A])( f:A => Boolean): List[A] = list match {
    case Nil => Nil
    case h::t => if (f(h)) h::filter2(t)(f) else filter(t, f)
  }

  def flatten[A](list: List[Option[A]]): List[A] = list match {
    case Nil => Nil
    case Some(h)::t =>h::flatten(t)
    case _::t => flatten(t)
  }

  def fold[A,B](list: List[A], initValue: B)(f:(A,B) => B): B = list match {
    case Nil => initValue
    case h::t => fold(t,f(h,initValue))(f)
  }


  def reverse[A](list: List[A]): List[A] = {
    def run(toReverse: List[A], result: List[A]): List[A] = {
      toReverse match {
        case Nil => result
        case head :: tail =>run(tail, head::result)
      }
    }
    run(list, Nil)
  }



}
