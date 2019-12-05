package thefuture

import org.apache.commons.io.IOUtils
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
object FacebookPage {
//  private val homeURL = "https://graph.facebook.com/v2.0/"
  private val homeURL = "https://postman-echo.com/get?foo1=bar1&foo2=bar2"

  private val accessToken = "CAAVHCxa"
  private val url = homeURL// s"$homeURL${"25"}/feed?method=GET&format=json&access_token=${accessToken}"
  def getFeeds(): String = {
    val request = new HttpGet(url)
    val client = HttpClientBuilder.create().build();
    val response = client.execute(request)
    IOUtils.toString(response.getEntity().getContent())
  }
}