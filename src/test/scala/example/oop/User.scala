package example.oop

/**
  * created by xudazhou
  */
class User {
    var uid: Int = _
    var userName: String = _

    def this(uid: Int, userName: String) {
        this()
        this.uid = uid
        this.userName = userName
    }

    def whoami(): Unit = {
        printf("i am %d %s%n", uid, userName)
    }
}
