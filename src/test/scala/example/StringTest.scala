package example

import org.scalatest.FunSuite

class StringTest extends FunSuite {
    test("format") {
        printf("%s %f %d", "a", 1.1, 2) // a 1.100000 2
    }

    test("charAt") {
        println("abc".charAt(1)) // b
    }
}
