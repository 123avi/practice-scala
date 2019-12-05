package thefuture

import org.apache.commons.io.IOUtils
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
object FacebookUser {

  val url =
  "https://graph.facebook.com/v5.0/me?fields=id%2Cname&access_token=EAABqcZARJ7ZAUBAISNPjMOpxBaEYgkGTpn5CJX3py8gsrUujr4ZADA7hn8ZCwvOlf7pUm9ch6eWYHSzNN7scLgq0Rnz4ZB32JFIMZAUr8SOY1BmgPUOSzmDn55r9g9oMdYwzAAa4jN9H881YBYDKFCFabYbCvt5KMBH2uDmO09e9wUpdAxLIEtnPZBgam21mfH53lW7U5xfwRIsxFggHanDdMTOBXiDkphKJpesomGSZCAZDZD"
  private val homeURL = "https://graph.facebook.com/v5.0/"

  private val accessToken = "EAABqcZARJ7ZAUBAIngWoRG32fprjVO0T5fGnHvUUZCCFB1jKpIsv1Vsd9ndXZBOqhx32ZCUS8PHCHifhffZB3n7re0a93fdZBLz8QokHnHh0pqeY6x8gJsQaB0gvSRnpmgZAGRTOT0JPktpebANu0ULeYWKrhZAcBzsl4zddrZAwhyIgMrXSwfZB0nkbvh5DXF0I57R3isxZBF0Oo9uv5MkGTZCSJXpLjEnZBZAxN6UBIgCgVeAAAZDZD"
//  private val url = s"$homeURL${"25"}/feed?method=GET&format=json&access_token=${accessToken}"
  def getFeeds(): String = {
    val request = new HttpGet(url)
    val client = HttpClientBuilder.create().build()
    val response = client.execute(request)
    IOUtils.toString(response.getEntity().getContent())
  }
}