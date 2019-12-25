package variance

abstract class Fruit { def name: String }

class Orange extends Fruit { def name = "Orange" }

class Apple extends Fruit { def name = "Apple" }

class Box[+F <: Fruit](aFruit: F) {

  def fruit: F = aFruit

  def contains = fruit.name.equals(aFruit.name)
}
////TYPE SAFE
//class OrangeBox(orange: Orange) extends Box {
//  def fruit: Orange = orange
//}
//
//class AppleBox(apple: Apple) extends Box {
//  def fruit: Apple = apple
//}
//

object VarianceDemo extends App {
  def printFruit(fs: List[Fruit]) = {
    fs.foreach(f => println(f.name))
  }

  val orange = new Orange
  val apple = new Apple
  //
  //  val appleBox = new AppleBox(apple)
  //  val orangeBox = new OrangeBox(orange)

  val appleBox1 = new Box[Apple](new Apple)
  val appleBox2 = new Box[Apple](new Apple)

  val orangeBox = new Box[Orange](new Orange)
  val boxes: List[Box[Fruit]] = List (appleBox1, appleBox2)
//  printFruit(boxes)

}
