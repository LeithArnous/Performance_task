package simulation

import config.BaseHelpers._
import io.gatling.core.Predef._
import jdk.nashorn.internal.ir.Splittable.SplitRange
import scenarios.ShopizerTest._



class perfTestSimulation extends Simulation {

  //mvn gatling:test
  //mvn clean gatling:test
  //mvn clean gatling:test -DShopizerusers=100 -DShopizerchusers=50 -DShopizercusers=30
  setUp(
    //scnShopizer.inject(atOnceUsers( users= 10))
    //scnShopizer.inject(rampUsers( users= 10).during(5))
    scnShopizerTables.inject(atOnceUsers(System.getProperty("Shopizerusers","1").toInt)),
      scnShopizerChairs.inject(atOnceUsers(System.getProperty("Shopizerchusers","1").toInt)),
      scnShopizerCart.inject(atOnceUsers(System.getProperty("Shopizercusers","1").toInt))

  ).protocols(httpProtocol)
}
