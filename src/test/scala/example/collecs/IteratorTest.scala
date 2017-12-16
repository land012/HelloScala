package example.collecs

import org.scalatest.FunSuite

class IteratorTest extends FunSuite {
    test("iterator_test") {
        var it = Iterator("a", "b", "c")
        while(it.hasNext) {
            println(it.next())
        }


        println(it.size) // 0
        println(it.length) // 0
    }

    test("iterator_max") {
        var it = Iterator("d", "b", "c")
        println(it.max) // d

        /*
          异常
          empty.max
          java.lang.UnsupportedOperationException: empty.max
         */
        println(it.max)
    }

    test("iterator_size") {
        var it = Iterator("d", "b", "c")
        println(it.next()) // d
        println(it.size) // 2
    }

    test("iterator_test2") {
        var l1 = List("a", "b", "c")
        var it1 = l1.iterator
        while(it1.hasNext) {
            println(it1.next())
        }
    }
}
