package example

object OperatorBitDemo {
    def main(args: Array[String]): Unit = {
        val a1 = 1;
        val a2 = 2;
        println(a1 & a2) // 0
        println(a1 | a2) // 3
        println(a1 ^ a2) // 3
        println(a1<<1) // 2
        println(a1>>1) // 0
    }
}
