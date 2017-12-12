package example

import org.scalatest.FunSuite

class SetTest extends FunSuite {
    test("set1") {
        val set1 = Set(1, 2, 3)
        println(set1) // Set(1, 2, 3)
        println(set1.exists(_ == 1)) // true
        println(set1.exists(_ % 3 == 0)) // true
        val set2 = set1.drop(2)
        println(set1) // Set(1, 2, 3)
        println(set2) // Set(3)
    }
}
