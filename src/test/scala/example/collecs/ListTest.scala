package example.collecs

import org.scalatest.FunSuite

class ListTest extends FunSuite {
    test("list1") {
        val list1 = "A" :: ("B" :: ("C" :: Nil))
        println(list1) // List(A, B, C)

        val list2 = "D" :: Nil
        val list3 = list1 ::: list2
        println(list3) // List(A, B, C, D)
        println(list3.apply(0)) // A
        println(list3.apply(1)) // B
    }

    // 柯里化函数???
    test("fill") {
        val l1 = List.fill(3)("Tom")
        println(l1) // List(Tom, Tom, Tom)
    }

    test("map") {
        val l1 = List(1, 2, 3)
        val r1 = l1.map(x => x match {
            case 3 => List('a', 'b')
            case _ => List(x * 2)
        })
        println(r1)
    }
}
