package thefuture

object DemoApp extends App {
  val facebookFeeds = FacebookPage.getFeeds()
  val parsedFacebookFeed = FacebookFeedParser.parse(facebookFeeds)

  parsedFacebookFeed.foreach(println)

  // do some other tasks
}