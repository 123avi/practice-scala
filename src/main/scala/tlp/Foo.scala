package tlp

trait Foo {
  type T
  def doSomething: T
}

object FooInt extends Foo{
  override type T = (Int, String, Double)
  override def doSomething: T = (10, "s", 1d)
}


