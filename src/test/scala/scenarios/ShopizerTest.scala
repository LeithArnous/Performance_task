package scenarios

import config.BaseHelpers.thinkTimer
//import io.gatling.core.Predef.{group, _}
import io.gatling.core.structure._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object ShopizerTest {

  def scnShopizerTables: ScenarioBuilder = {
    scenario( scenarioName= "Shopizer Tables")
      .exec(flushHttpCache)
      .exec(flushCookieJar)
      .exitBlockOnFail(
        group(  "Home and Table Page"){
          exec(api.home.ping())
            .exec(api.home.default())
            .exec(api.lang.item())
            .exec(api.lang.header())
            .exec(api.lang.content())
            .exec(api.product.price50())
            .exec(api.product.price51())
            .exec(api.product.price52())
            .exec(api.product.price1())
            .exec(thinkTimer())
        }
          .group( "Tables Page"){
            exec(api.home.ping())
              .exec(api.lang.header())
              .exec(api.lang.category())
              .exec(api.home.default())
              .exec(api.lang.content())
              .exec(api.product.price1())
              .exec(api.category.manufacturers50())
              .exec(api.category.variants50())
              .exec(api.product.productscat50())
              .exec(api.category.category50())

          }
          .group( "Open table"){
            exec(api.home.ping())
              .exec(api.lang.header())
              .exec(api.home.default())
              .exec(api.lang.category())
              .exec(api.lang.content())
              .exec(api.product.price1())
              .exec(api.product.product1())
              .exec(api.product.product1reviews())
              .exec(thinkTimer())
          }
          .group( "Add table") {
            exec(api.cart.cartdefault())
              .exec(api.cart.cartid())
            })}
    def scnShopizerChairs: ScenarioBuilder = {
      scenario( scenarioName= "Shopizer Chairs")
        .exec(flushHttpCache)
        .exec(flushCookieJar)
        .exitBlockOnFail(

          group( "Chairs Page"){
            exec(api.home.ping())
              .exec(api.lang.header())
              .exec(api.lang.category())
              .exec(api.home.default())
              .exec(api.lang.content())
              .exec(api.category.manufacturers51())
              .exec(api.category.variants51())
              .exec(api.product.productscat51())
              .exec(api.category.category51())
              .exec(api.product.price50())
              .exec(api.product.price51())
              .exec(api.product.price52())
              .exec(thinkTimer())
          }
          .group( "Open chair"){
            exec(api.home.ping())
              .exec(api.lang.header())
              .exec(api.lang.category())
              .exec(api.home.default())
              .exec(api.product.product51())
              .exec(api.product.product51reviews())
              .exec(thinkTimer())
          }
          .group( "Add chair"){
            exec(api.cart.cartiddefault())
              .exec(api.cart.cartid())
              .exec(thinkTimer())
          }
            .group( "chairs Pafaefage"){
              exec(api.home.ping())
                .exec(api.lang.header())
                .exec(api.lang.category())
                .exec(api.home.default())
                .exec(api.lang.content())
                .exec(api.product.price1())
                .exec(api.category.manufacturers50())
                .exec(api.category.variants50())
                .exec(api.product.productscat50())
                .exec(api.category.category51())
                .exec(api.product.product1())
                .exec(api.product.product1reviews())
                .exec(api.lang.item())
                .exec(api.product.price50())
                .exec(api.product.price51())
                .exec(api.product.price52())
                .exec(thinkTimer())
            }

        )}
  def scnShopizerCart: ScenarioBuilder = {
    scenario( scenarioName= "Shopizer Cart")
      .exec(flushHttpCache)
      .exec(flushCookieJar)
      .exitBlockOnFail(

        group( "Cart Page"){
          exec(api.home.ping())
            .exec(api.lang.header())
            .exec(api.home.default())
            .exec(api.lang.category())
            .exec(api.lang.content())
            .exec(api.cart.cartiddefault())
            .exec(api.cart.cartiddefault())
            .exec(thinkTimer())
        }
          .group( "Checkout"){
            exec(api.home.ping())
              .exec(api.lang.header())
              .exec(api.cart.cartgetdefault())
              .exec(api.cart.zonecode())
              .exec(api.cart.zonecode())
              .exec(api.cart.shipping())
              .exec(api.cart.config())
              .exec(api.cart.total())
              .exec(api.cart.shippingid())
              .exec(api.home.default())
              .exec(api.lang.category())
              .exec(api.lang.content())
              .exec(thinkTimer())
          }

      )}

}
