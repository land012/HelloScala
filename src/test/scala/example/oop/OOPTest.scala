package example.oop

import org.scalatest.FunSuite

/**
  * created by xudazhou
  */
class OOPTest extends FunSuite {
    test("oop1") {
        val p1 = new Point(1, 2)
        println(classOf[Point]) // class example.oop.Point
        println(p1.isInstanceOf[Point]) // true
    }

    test("oop2") {
        val u1: User = new User
        u1.uid = 2
        u1.userName = "tom"
        u1.whoami() // i am 2 tom
    }
}
