package example

import org.scalatest.FunSuite

import scala.util.control.Breaks

class ForTest extends FunSuite {
    test("while test") {
        var i = 0
        while (i < 3) {
            println(i)
            i += 1
        }
    }

    // 包括 end
    test("for1") {
        for(x <- 1 to 3) {
            println(x)  // 1 2 3
        }
    }

    // 不包括 end
    test("for2") {
        for(x <- 1 until 3) {
            println(x)  // 1 2
        }
    }

    /*
        1|1
        1|2
        2|1
        2|2
        3|1
        3|2
     */
    test("for3") {
        for(x <- 1 to 3; y <- 1 until 3) {
            println(x + "|" + y)
        }
    }

    test("forList") {
        val list1 = List(1, 2, 3)
        for (x <- list1) {
            println(x)
        }
    }

    test("for5") {
        for (x <- 1 to 6; if x % 2 == 0) {
            println(x)
        }
    }

    test("for6") {
        val list2 = for {x <- 1 to 6; if x % 2 == 0} yield x
        println(list2) // Vector(2, 4, 6)
    }

    test("for_array") {
        for (x <- Array.range(0, 10, 2)) {
            println(x) // 0 2 4 6 8
        }
    }

    test("break1") {
        val loop1 = new Breaks
        loop1.breakable {
            for (x <- 1 to 3) {
                println(x)
                if (x == 2) {
                    loop1.break
                }
            }
        }
    }
}
