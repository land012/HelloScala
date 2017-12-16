package example.oop

class Point(px : Int, py : Int) {
    var x = px
    var y = py

    println("I am " + this)

    def move(dx : Int, dy : Int): Unit = {
        x = x + dx
        y = y + dy
    }

    override def toString: String = {
        getClass.getName + "[" + x + "," + y + "]"
    }
}

object Test {
    def main(args: Array[String]): Unit = {
        val pt = new Point(1, 1) // I am example.oop.Point[1,1]
        println(pt) // example.oop.Point[1,1]
        pt.move(1, 2)
        println(pt) // example.oop.Point[2,3]
    }
}
