package example

import org.scalatest.FunSuite

import scala.util.Random

/**
  * created by xudazhou
  */
class RandomTest extends FunSuite {
    test("random") {
        val rand = new Random
        for (i <- 0 to 4)
            println(rand.nextInt(2))
    }
}
