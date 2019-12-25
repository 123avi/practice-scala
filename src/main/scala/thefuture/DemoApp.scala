package thefuture

import java.util.concurrent.Executors

import scala.concurrent.{Await, ExecutionContext, Future, Promise}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success


object DemoApp extends App {

  val p2 = Promise[String]
  val p = Promise[FacebookUserDetails]

  val tp = Executors.newFixedThreadPool(10)
  implicit val ec = ExecutionContext.fromExecutor(tp)
  println(s"MAIN Thread ${Thread.currentThread().getName}")

  val facebookUser: Future[String] = Future{
    println(s"Thread pool1 ${Thread.currentThread().getName}")
    FacebookUser.getFeeds()
}(ec)
//    .recoverWith{
//    case e =>
//      e.printStackTrace()
//      p2.success("""{"id":"0", "name":"john doe"}""")
//      p2.future
//  }

  val facebookUserX: Future[FacebookUserDetails] = Future{
    val feeds = FacebookUser.getFeeds()
    FacebookUserParser.parser(feeds)
}.recoverWith{
    case e =>
      e.printStackTrace()
      p.success(FacebookUserDetails("none", "john doe"))
      p.future
  }(ec)



  val parsedFacebookUser: Future[FacebookUserDetails] = facebookUser.map(s => FacebookUserParser.parser(s))

  parsedFacebookUser.onComplete{
    case Success(value) =>
      println(s"Thread ${Thread.currentThread().getName}")
      println(value)
    case _ =>
      println(s"Thread pool2 ${Thread.currentThread().getName}")

  }

  val result: FacebookUserDetails = Await.result(parsedFacebookUser, 100 seconds)

//  parsedFacebookUser.foreach(println)

  println(result)
  // do some other tasks

}