package thefuture

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global


object DemoApp extends App {

  val facebookUser: Future[String] = Future(FacebookUser.getFeeds())
  val parsedFacebookUser: Future[FacebookUserDetails] = facebookUser.map(s => FacebookUserParser.parser(s))

  val result: FacebookUserDetails = Await.result(parsedFacebookUser, 100 seconds)

//  parsedFacebookUser.foreach(println)

  println(result)
  // do some other tasks
}