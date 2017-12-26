package example

object OperatorDemo {
    def main(args: Array[String]): Unit = {
        val a1 = 5;
        val a2 = 3;
        println(a1 / a2);  // 1

        val a3 = 5d
        val a4 = 3
        println(a3 / a4)  // 1.6666666666666667

//        a1++;
//        println(a1);

        println(a1 == a2)  // false
    }
}
