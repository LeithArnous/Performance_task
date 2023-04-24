package api

import config.BaseHelpers.{Shopizer, localhost}
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object home {
  def ping(): ChainBuilder = {
    exec(
      http("GET:PING")
        .get(localhost + "/actuator/health/ping")
        .resources(http("OP:PING")
          .options(localhost + "/actuator/health/ping"))
    )
  }
    def default(): ChainBuilder = {
      exec(
        http("GET:default")
          .get(Shopizer+"/store/DEFAULT")
          .resources(http("OP:default")
            .options(Shopizer+"/store/DEFAULT"))
      )
    }
  }
