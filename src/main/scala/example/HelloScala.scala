package example

object HelloScala {
    def main(args:Array[String]) {
        println("Hello Scala");

        var i2 : Int = 1;
        var i3 : Int = 2;
        print(i2)  // 不换行
        println(i3)
    }

    def f(): Unit = {
        println("a")
    }
}
