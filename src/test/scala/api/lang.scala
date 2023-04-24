package api

import config.BaseHelpers.Shopizer
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object lang {

  def item(): ChainBuilder = {
    exec(
      http("GET:item")
        .get(Shopizer+"/products/group/FEATURED_ITEM?store=DEFAULT&lang=en")
        .resources(http("OP:item")
          .options(Shopizer+"/products/group/FEATURED_ITEM?store=DEFAULT&lang=en"))
    )
  }
  def header(): ChainBuilder = {
    exec(
      http("GET:header")
        .get(Shopizer+"/content/boxes/headerMessage/?lang=en")
        .resources(http("OP:header")
          .options(Shopizer+"/content/boxes/headerMessage/?lang=en"))
    )
  }
  def category(): ChainBuilder = {
    exec(
      http("GET:category")
        .get(Shopizer+"/category/?count=20&page=0&store=DEFAULT&lang=en")
        .resources(http("OP:category")
          .options(Shopizer+"/category/?count=20&page=0&store=DEFAULT&lang=en"))
    )
  }
  def content(): ChainBuilder = {
    exec(
      http("GET:content")
        .get(Shopizer+"/content/pages/?page=0&count=20&store=DEFAULT&lang=en")
        .resources(http("OP:content")
          .options(Shopizer+"/content/pages/?page=0&count=20&store=DEFAULT&lang=en"))
    )
  }

}

