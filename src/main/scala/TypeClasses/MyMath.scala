package TypeClasses

object MyMath {
  trait Num[T]{
    def plus(x: T, y: T): T
    def divide(x: T, y: Int): T = ???
    def minus(x: T, y: T): T
    def multiply (x: T, y: T): T
  }

}
