package example

import java.io.{BufferedReader, File, FileReader}

import org.scalatest.FunSuite

/**
  * created by xudazhou
  */
class FileTest extends FunSuite {
    test("test_path") {
        val f1 = new File(".")
        println(f1.getAbsoluteFile.getCanonicalPath) // D:\_idea2017\HelloScala
        println(f1.getAbsolutePath) // D:\_idea2017\HelloScala\.
    }

    // 怎么判断文件结束
    test("test_readfile") {
        val br : BufferedReader = new BufferedReader(new FileReader("./src/test/resources2/file1.txt"))
        var line = br.readLine()
        while (!line.eq(null)) {
            println(line.getClass.getName)
            line = br.readLine()
        }
    }
}
