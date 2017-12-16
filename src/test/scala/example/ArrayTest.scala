package example;


import org.scalatest.FunSuite;

/**
 * create by xudazhou 2017/12/11
 */
class ArrayTest extends FunSuite {
    test("array1") {
        val arr1 : Array[String] = new Array[String](3)
        arr1(0) = "a"
        arr1(1) = "b"
        arr1(2) = "c"
        println(arr1)
        println(arr1.length)
        for (a <- arr1) {
            println(a) // a b c
        }

        arr1(0) = "d"
        for (a <- arr1) {
            println(a) // d b c
        }
    }

    test("array2") {
        val arr1 = Array(Array(1, 2, 3), Array(4, 5, 6))
        for (i <- 0 until arr1.length; j  <- 0 until arr1(0).length) {
            println(arr1(i)(j))
        }
    }

    test("array3") {
        val arr1 = Array(1, 2, 3)
        val arr2 = Array(4, 5)
        val arr3 = Array.concat(arr1, arr2)
        println(arr3.length) // 5
    }

    // range
    test("array4") {
        // 不包括 end
        val arr1 = Array.range(0, 6, 2)
        for (x <- arr1) {
            println(x)
        }
    }
}
