package challenge

import example.Hello
import org.scalatest.{FlatSpec, Matchers}

class ExercisesTest extends FlatSpec with Matchers {

  "compress" should "remove repeated elements " in {
    Exercises.compress(List(1,1,1,2,2,1,3,3,2,3,4)) shouldEqual List(1,2,1,3,2,3,4)
  }

  "filter" should " remove all elements that does not comply " in {
    Exercises.filter(List(1,2,3,4,5,6,7,8), (c:Int) =>  c % 2 == 0) shouldEqual List(2,4,6,8)
  }

  "filter2" should "remove all elements that does not comply " in {
    Exercises.filter2(List(1,2,3,4,5,6,7,8)) (_ % 2 == 0) shouldEqual List(2,4,6,8)
  }

  "flatten" should "remove all NONE elements " in {
    Exercises.flatten(List(Some(1), None, Some(2), Some(3), None)) shouldEqual List(1,2,3)
  }

  "fold" should "sum all elements starting with the init value " in {
    Exercises.fold(List(1,2,3,5),"10")(_+_) shouldEqual 21
  }

  "reverse" should "return reveres list with all elements starting with last element " in {
    Exercises.reverse(List("a", "b", "c", "d", "e")) shouldEqual List("e", "d", "c", "b", "a")
  }


}
