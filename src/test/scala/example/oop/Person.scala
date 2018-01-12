package example.oop

/**
  * created by xudazhou
  */
class Person {
    {
        println("here is class")
    }

    var pname: String = "tom"

    def apply() = {
        println("i am class.Person apply")
    }
}

object Person {
    {
        println("here is object")
    }
    def apply() = {
        println("i am object.Person apply")
        new Person()
    }
}

object PersonTest {
    def main(args: Array[String]): Unit = {
        // 只打印了 here is class
        var p1 = new Person()
        printf(p1.pname) // tom
    }
}