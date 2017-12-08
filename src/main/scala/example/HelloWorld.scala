package example

object HelloWorld extends App {
    val ages = Seq(42, 75, 29, 64)
    printf(s"The oldest persion is ${ages.max}")
}
