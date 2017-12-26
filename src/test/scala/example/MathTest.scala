package example

import org.scalatest.FunSuite

/**
  * created by xudazhou
  */
class MathTest extends FunSuite {
    test("math_test") {
        println(math.pow(0.997, 2015)) // 0.002348248199333753

        val bd1 = BigDecimal.apply(0.997)
        println(bd1) // 0.997
        println(bd1.pow(2015)) // 0.002348248199333765338460658246456247ll
    }

    // 没有求幂操作符
    test("test_operator") {
//        println(2 ** 3)
    }
}
