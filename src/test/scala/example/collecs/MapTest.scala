package example.collecs

import org.scalatest.FlatSpec

/**
  * idea 似乎区分不了不同的测试方法
  */
class MapTest extends FlatSpec {
    it should "map test" in {
        var map1: Map[String, String] = Map()
        map1 += ("k1" -> "v1")
        map1 += ("k2" -> "v2")
        map1 += ("k3" -> "v2")
        println(map1) // Map(k1 -> v1, k2 -> v2, k3 -> v2)
        println(map1.keys) // Set(k1, k2, k3)
        println(map1.values) // MapLike.DefaultValuesIterable(v1, v2, v2)
        println(map1.get("k2")) // Some(v2)
        println(map1("k1")) // v1
//        println(map1("k4")) // java.util.NoSuchElementException: key not found: k4
    }

    it should "map merge" in {
        var map1 = Map("k1" -> "v1", "k2" -> "v2")
        var map2 = Map("k2" -> "v22", "k3" -> "v3")
        var map3 = map1.++(map2)
        println(map3) // Map(k1 -> v1, k2 -> v22, k3 -> v3)
    }
}
