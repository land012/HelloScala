package example.collecs

import org.scalatest.FunSpec

class TupleTest extends FunSpec {
    /**
      * idea 可以区分到 it 级别
      */
    describe("tuple test") {
        it("test1") {
            var tuple1 = (3, 2.5, "tom")
            println(tuple1._1) // 3
        }

        it("test2") {
            var tuple1 = (3, 2.5, "tom")
            println(tuple1._3) // tom
        }

        it("test3") {
            var tuple1 = (3, 2.5, "tom")
            tuple1.productIterator
                .foreach(i => println(i))
        }
    }

}
