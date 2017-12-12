package example

import org.scalatest.FunSuite
import scala.collection.mutable.Set

class SetMutableTest extends FunSuite {
    test("set1") {
        val set1 = Set(1, 2, 3)
        set1.add(5) // Set(1, 5, 2, 3)
        println(set1)
        val set2 = set1.drop(2)
        println(set1) // Set(1, 5, 2, 3)
        println(set2) // Set(2, 3)
        set1.remove(5)
        println(set1) // Set(1, 2, 3)

        set1 += 6
        println(set1) // Set(1, 2, 6, 3)

        set1 -= 7
        println(set1) // Set(1, 2, 6, 3)
    }
}
