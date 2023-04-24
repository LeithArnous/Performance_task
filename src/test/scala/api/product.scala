package api

import config.BaseHelpers.Shopizer
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product {


  def price50(): ChainBuilder = {

    exec(
      http("POST:price50")
        .post(Shopizer + "/product/50/price")
        .resources(http("OP:price50")
          .options(Shopizer + "/product/50/price"))
    )
  }
  def price51(): ChainBuilder = {

    exec(
      http("POST:price51")
        .post(Shopizer + "/product/51/price")
        .resources(http("OP:price51")
          .options(Shopizer + "/product/51/price"))
    )
  }
  def price52(): ChainBuilder = {

    exec(
      http("POST:price52")
        .post(Shopizer + "/product/52/price")
        .resources(http("OP:price52")
          .options(Shopizer + "/product/52/price"))
    )
  }
  def price1(): ChainBuilder = {

    exec(
      http("POST:price1")
        .post(Shopizer + "/product/1/price")
        .resources(http("OP:price1")
          .options(Shopizer + "/product/1/price"))
    )
  }

  def product1(): ChainBuilder = {
    exec(
      http("GET:product1")
        .get(Shopizer+"/products/1?lang=en&store=DEFAULT")
        .resources(http("OP:product1")
          .options(Shopizer+"/products/1?lang=en&store=DEFAULT"))
    )
  }

  def product51(): ChainBuilder = {
    exec(
      http("GET:product51")
        .get(Shopizer+"/products/51?lang=en&store=DEFAULT")
        .resources(http("OP:product51")
          .options(Shopizer+"/products/51?lang=en&store=DEFAULT"))
    )
  }
  def product1reviews(): ChainBuilder = {
    exec(
      http("GET:product1reviews")
        .get(Shopizer+"/products/1?lang=en&store=DEFAULT")
        .resources(http("OP:product1reviews")
          .options(Shopizer+"/products/1?lang=en&store=DEFAULT"))
    )
  }


  def productscat50(): ChainBuilder = {
    exec(
      http("GET:productscat50")
        .get(Shopizer+"/products/?&store=DEFAULT&lang=en&page=0&count=15&category=50")
        .resources(http("OP:productscat50")
          .options(Shopizer+"/products/?&store=DEFAULT&lang=en&page=0&count=15&category=50"))
    )
  }
  def productscat51(): ChainBuilder = {
    exec(
      http("GET:productscat51")
        .get(Shopizer+"/products/?&store=DEFAULT&lang=en&page=0&count=15&category=51")
        .resources(http("OP:productscat51")
          .options(Shopizer+"/products/?&store=DEFAULT&lang=en&page=0&count=15&category=51"))
    )
  }
  def product51reviews(): ChainBuilder = {
    exec(
      http("GET:product51reviews")
        .get(Shopizer + "/products/51?lang=en&store=DEFAULT")
        .resources(http("OP:product51reviews")
          .options(Shopizer + "/products/51?lang=en&store=DEFAULT"))
    )
  }}
