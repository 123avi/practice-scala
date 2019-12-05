package challenge

object Exercises {

    //filter all elements from in a list that does not comply
  def filter[A](list: List[A], f:A => Boolean): List[A] = list match {
    case Nil => Nil
    case head::tail =>
      if( f(head))
        head::filter(tail, f)
      else
        filter(tail, f)
  }

  def filter2[A](list: List[A])( f:A => Boolean): List[A] = ???

  //If a list contains repeated elements they should be replaced with a single copy of the element.
  // The order of the elements should not be changed.
  def compress[A](list: List[A]): List[A] = ???

  def flatten[A](list: List[Option[A]]): List[A] = ???
  /*
  Applies a binary operator to all elements of this list and a start value, going right to left.
  B  the result type of the binary operator.
  z the start value.
  op  the binary operator.

    returns
  the result of inserting op between consecutive elements of this list, going right to left with the start value z on the right:
    op(x_1, op(x_2, ... op(x_n, z)...))
  where x1, ..., xn are the elements of this list. Returns z if this list is empty.
   */

  def fold[A,B](list: List[A], initValue: B)(f:(A,B) => B): B = ???

  def reverse[A](list: List[A]): List[A] = ???


}