package highorder
import LoMeshane._
object LoMeshane {

  implicit class MyInt(i: Int) {
    def isPos: Boolean = i > 0

    def isNeg = !isPos
  }

}

object Bux {

  implicit class M(z: Int) {
    def isPos = false
  }

}
object ImplicitDemp extends App {
     def newPos(c: Int ) = c.isPos
     def newNeg(c: Int ) = c.isNeg

  println(s"New Pos ${newPos(10)}")
  println(s"New Neg ${newNeg(10)}")


}
