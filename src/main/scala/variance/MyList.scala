package variance

sealed trait MyList[+A]
case object Nil extends MyList[Nothing]
case class Cons[A](head: A, tail: MyList[A]) extends MyList[A]

object MyList {

  def apply[A](as: A*): MyList[A] = if (as.isEmpty) Nil
  else Cons(as.head, MyList(as.tail: _*))

  def fill[A](n: Int, a: A): MyList[A] = {
    if (n == 0)
      Nil
    else
      Cons(a, fill(n - 1, a))
  }

  def map[A, B](list: MyList[A], op: A => B): MyList[B] = {
    def run(ls: MyList[A]): MyList[B] = {
      ls match {
        case Nil => Nil
        case Cons(head, tail) => Cons(op(head), map(tail, op))
      }
    }

    run(list)
  }
}

object DemoVariance extends App {
  val ps = MyList.fill(3, Man("a"))
  MyList.map(ps, println)

}





