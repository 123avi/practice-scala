package thefuture

import net.liftweb.json.JsonAST.JNothing
import net.liftweb.json.{DefaultFormats, JValue}

object FacebookFeedParser {
  implicit val formats = DefaultFormats
  def parse(facebookFeeds: String): List[FacebookPageFeed] = {
    val parsedFacebookFeeds = net.liftweb.json.parse(facebookFeeds)
    (parsedFacebookFeeds \ "data").children map { facebookfeed =>
      val contentId = (facebookfeed \ "id")
      val date = (facebookfeed \ "created_time")
      val content = (facebookfeed \ "message")
      FacebookPageFeed(contentId, date, content)
    }
  }

  implicit def extract(json: JValue): String = json match {
    case JNothing => ""
    case data => data.extract[String]
  }
}
case class FacebookPageFeed(id: String, date: String, content: String)