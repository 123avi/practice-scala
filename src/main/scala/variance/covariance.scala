package variance

trait covariance

class Waste
class Paper extends Waste
class Glass extends Waste

class Container[+T]

object Office {
  def setPaperContainer(container: Container[Paper]): Unit = ???

  def setGlassContainer(container: Container[Glass]): Unit = ???
}