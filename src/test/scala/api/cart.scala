package api

import config.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._


object cart {

  def cartid(): ChainBuilder = {
    exec(
      http("GET:cartid")
        .get(localhost + "/cart/7e6f5817221f469783b2f159ecdc818a?lang=en")
        .resources(http("OP:cartid")
          .options(localhost + "/cart/7e6f5817221f469783b2f159ecdc818a?lang=en"))
    )
  }
  def cartiddefault(): ChainBuilder = {
    exec(
      http("PUT:cartiddefault")
        .put(localhost + "/cart/7e6f5817221f469783b2f159ecdc818a?store=DEFAULT")
        .resources(http("OP:cartiddefault")
          .options(localhost + "/cart/7e6f5817221f469783b2f159ecdc818a?store=DEFAULT"))
    )}
  def cartgetdefault(): ChainBuilder = {
    exec(
      http("GET:cartgetdefault")
        .get(localhost + "/cart/7e6f5817221f469783b2f159ecdc818a?store=DEFAULT")
        .resources(http("OP:cartgetdefault")
          .options(localhost + "/cart/7e6f5817221f469783b2f159ecdc818a?store=DEFAULT"))
    )}
  def cartdefault(): ChainBuilder = {
    exec(
      http("POST:cartdefault")
        .post(Shopizer+"/cart/?store=DEFAULT")
        .resources(http("OP:cartdefault")
          .options(Shopizer+"/cart/?store=DEFAULT"))
    )
  }
  def zonecode(): ChainBuilder = {
    exec(
      http("GET:zonecode")
        .get(Shopizer+"/zones/?code=")
        .resources(http("OP:zonecode")
          .options(Shopizer+"/zones/?code="))
    )
  }
  def shipping(): ChainBuilder = {
    exec(
      http("GET:shipping")
        .get(Shopizer+"/shipping/country?store=DEFAULT&lang=en")
        .resources(http("OP:shipping")
          .options(Shopizer+"/shipping/country?store=DEFAULT&lang=en"))
    )
  }
  def shippingid(): ChainBuilder = {
    exec(
      http("POST:shippingid")
        .post(Shopizer+"/cart/7e6f5817221f469783b2f159ecdc818a/shipping")
        .resources(http("OP:shippingid")
          .options(Shopizer+"/cart/7e6f5817221f469783b2f159ecdc818a/shipping"))
    )
  }
  def config(): ChainBuilder = {
    exec(
      http("GET:config")
        .get(Shopizer+"/config")
        .resources(http("OP:config")
          .options(Shopizer+"/config"))
    )
  }
  def total(): ChainBuilder = {
    exec(
      http("GET:total")
        .get(Shopizer+"/cart/7e6f5817221f469783b2f159ecdc818a/total")
        .resources(http("OP:total")
          .options(Shopizer+"/cart/7e6f5817221f469783b2f159ecdc818a/total"))
    )
  }
}
