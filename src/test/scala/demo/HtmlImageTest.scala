package demo

import org.scalatest.FunSuite

/**
  * created by xudazhou
  */
class HtmlImageTest extends FunSuite {
    test("decimal_format") {
        for (i <- 1 to 204) {
            printf("<img src =\"images/%03d.jpg\" />%n", i)
            println("<hr/>")
        }
    }
}
