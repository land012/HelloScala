package example.collecs

import org.scalatest.FunSuite

class SetTest extends FunSuite {
    test("set1") {
        val set1 = Set(1, 2, 3)
        println(set1) // Set(1, 2, 3)
        println(set1.exists(_ == 1)) // true
        println(set1.exists(_ % 3 == 0)) // true
        println(set1.exists(i => i%2 == 0)) // true
        var set2 = set1.drop(2)
        println(set1) // Set(1, 2, 3)
        println(set2) // Set(3)

        set2 = Set(5)

        val set3 = set1 ++ set2
        println(set3) // Set(1, 2, 3, 5)

        val set4 = set1.++(set2)
        println(set4) // Set(1, 2, 3, 5)
    }
}
