package config

import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object BaseHelpers {

  val localhost = "http://localhost:8080"
  val Shopizer = "http://localhost:8080/api/v1"

  def thinkTimer(Min :Int = 2, Max : Int = 5): ChainBuilder ={
    pause(Min, Max)
  }

  val httpProtocol = http
    .baseUrl("http://localhost")
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:109.0) Gecko/20100101 Firefox/111.0")
}
