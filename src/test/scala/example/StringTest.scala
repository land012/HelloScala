package example

import org.scalatest.FunSuite

class StringTest extends FunSuite {
    test("format") {
        printf("%s %f %d", "a", 1.1, 2) // a 1.100000 2
    }

    test("format2") {
        printf("%3s%n", 2)  // 左侧补两个空格 "  2"
        printf("%03d%n", 2) // "002"
    }

    test("charAt") {
        println("abc".charAt(1)) // b
    }

    test("equal") {
        val str1 = "abc"
        val str2 = new String("abc")
        println(str1 == str2) // true
    }
}
