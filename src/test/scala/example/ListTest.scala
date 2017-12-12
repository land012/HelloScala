package example

import org.scalatest.FunSuite

class ListTest extends FunSuite {
    test("list1") {
        val list1 = "A" :: ("B" :: ("C" :: Nil))
        println(list1) // List(A, B, C)

        val list2 = "D" :: Nil
        val list3 = list1 ::: list2
        println(list3) // List(A, B, C, D)
    }

    test("fill") {
        val l1 = List.fill(3)("Tom")
        println(l1) // List(Tom, Tom, Tom)
    }
}
