package example

class Outer {
    class Inner {
        def f () {
            println("f")
        }
    }

    (new Inner).f()
}
