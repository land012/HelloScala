package example

import org.scalatest.FunSuite

class FunctionTest extends FunSuite {
    def fun1(a1:Int): Unit = {
        println(a1)
    }

    test("function") {
        fun1(2)
    }

    def time(): Long = {
        val nano = System.nanoTime()
        println("current nanotime " + nano)
        return nano
    }

    def delayed (t: Long): Unit = {
        println("in delayed")
        println("delayed:" + t)
    }

    // 这两种写法的区别?
    def delayed2 (t: => Long): Unit = {
        println("in delayed")
        println("delayed:" + t)
    }

    test("call_func") {
        delayed(time)
    }

    test("call_func2") {
        delayed(time())
    }

    def func2 (a : Int, b : Int): Unit = {
        println(a + "|" + b)
    }

    // 指定函数参数名
    test("func2") {
        func2(b=2, a=1)
    }

    // 可变参数
    def func3(args: String*): Unit = {
        for (arg <- args) {
            println(arg)
        }
    }

    test("func3") {
        func3("a", "b", "c")
    }

    // 递归，省略 return 的写法
    def recursion(n : Int): Int = {
        if (n <= 1) {
            1
        } else {
            n * recursion(n - 1)
        }
    }

    test("recursion") {
        println(recursion(3)) // 6
        println(recursion(4)) // 24
    }

    // 函数默认值
    def func5(a: Int = 1, b:Int = 2): Unit = {
        println(a + b)
    }

    test("func5") {
        func5(2) // 4
    }

    // 高阶函数
    def func6(f : (Int, String) => String, v : Int, w : String): String = f(v, w)

    def func7[A, B](x : A, y : B) = "+" + x.toString() + "|" + y.toString + "+"

    test("high-order function") {
        println(func6(func7, 3, "tom")) // +3|tom+
    }

    // 内嵌函数
    def func8(): Unit = {
        def func9(): Unit = {
            println("haha")
        }
        func9()
    }

    test("func8") {
        func8()
    }

    // 匿名函数
    var func10 = (x: Int) => x + 1

    test("anoymous_func") {
        println(func10(2)) // 3
    }

    // 偏函数
    def fun11(a: Int, b: Int): Unit = {
        println(a + b)
    }

    test("func11") {
        val func12 = fun11(1, _ : Int)
        func12(2) // 3
        func12(3) // 4
    }

    // 柯里化
    def currying(x: Int)(y: Int) = x + y

    test("currying") {
        println(currying(1)(2)) // 3
    }

    // 闭包
    val factor = 3
    val func12 = (x : Int) => x * factor

    test("func12") {
        println(func12(2)) // 6
    }
}
