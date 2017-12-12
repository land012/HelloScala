package example

object ifdemo {
    def main(args: Array[String]): Unit = {
        val a1 = 1
        val a2 = 2
        if (a1 > a2) {
            println("1")
        } else if (a1 == a2) {
            println("0")
        } else {
            println("-1")
        }
    }
}
