package tlp

sealed trait State
trait On extends State
trait Off extends State

//step 1 define the trait with the type parameter
trait Light[P <: State]

//define companion object
object Light{

  def apply[X <: State] = new Light[X]{}

  def turnOn[P <: Off](b: Light[P]) = Light[On]
  def turnOff[P <: On](b: Light[P]) = Light[Off]
}

object DemoPhantom extends App {
  val lightOn: Light[On] = Light[On]
  val lightOff: Light[Off] = Light.turnOff(lightOn)
  val turnOnTheLight: Light[On] = Light.turnOn(lightOff)

  val tryToTurnOffTurnedOff: Light[Off] = Light.turnOff(lightOn)
}