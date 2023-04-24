package api

import config.BaseHelpers.Shopizer
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object category {
  def category50(): ChainBuilder = {
    exec(
      http("GET:category50")
        .get(Shopizer+"/category/50?store=DEFAULT&lang=en")
        .resources(http("OP:category50")
          .options(Shopizer+"/category/50?store=DEFAULT&lang=en"))
    )
  }
  def category51(): ChainBuilder = {
    exec(
      http("GET:category51")
        .get(Shopizer+"/category/51?store=DEFAULT&lang=en")
        .resources(http("OP:category51")
          .options(Shopizer+"/category/51?store=DEFAULT&lang=en"))
    )
  }
  def manufacturers50(): ChainBuilder = {
    exec(
      http("GET:manufacturers50")
        .get(Shopizer+"/category/50/manufacturers/?store=DEFAULT&lang=en")
        .resources(http("OP:manufacturers50")
          .options(Shopizer+"/category/50/manufacturers/?store=DEFAULT&lang=en"))
    )
  }
  def variants50(): ChainBuilder = {
    exec(
      http("GET:variants50")
        .get(Shopizer+"/category/50/variants/?store=DEFAULT&lang=en")
        .resources(http("OP:variants50")
          .options(Shopizer+"/category/50/variants/?store=DEFAULT&lang=en"))
    )
  }
  def manufacturers51(): ChainBuilder = {
    exec(
      http("GET:manufacturers51")
        .get(Shopizer+"/category/51/manufacturers/?store=DEFAULT&lang=en")
        .resources(http("OP:manufacturers51")
          .options(Shopizer+"/category/51/manufacturers/?store=DEFAULT&lang=en"))
    )
  }
  def variants51(): ChainBuilder = {
    exec(
      http("GET:variants51")
        .get(Shopizer+"/category/51/variants/?store=DEFAULT&lang=en")
        .resources(http("OP:variants51")
          .options(Shopizer+"/category/51/variants/?store=DEFAULT&lang=en"))
    )
  }
}