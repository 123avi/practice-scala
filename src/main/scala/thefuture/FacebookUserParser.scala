package thefuture

import net.liftweb.json.{DefaultFormats, _}

object FacebookUserParser {
  implicit val formats = DefaultFormats
  def parser(facebookUser: String): FacebookUserDetails = {
    val obj = parse(facebookUser)
    obj.extract[FacebookUserDetails]

  }

}
case class FacebookUserDetails(id: String, name: String)