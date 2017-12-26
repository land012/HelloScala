package example

import java.util.{Calendar, Date}

import org.scalatest.FunSuite

/**
  * created by xudazhou
  */
class DateTest extends FunSuite {
    test("date_test") {
        // 2017-12-19
        val cal1 : Calendar = new Calendar.Builder()
            .setDate(2017, 11, 19)
            .build()
        println(cal1.getTime) // Tue Dec 19 00:00:00 CST 2017
        cal1.add(Calendar.DAY_OF_MONTH, -89)
        println(cal1.getTime)
    }

    test("timestamp_test") {
        val cal1 = new Calendar.Builder()
            .setDate(2017, 11, 19)
            .setTimeOfDay(12, 30, 0)
            .build()
        println(cal1.getTime) // Tue Dec 19 12:30:00 CST 2017
        println(cal1.getTime.getTime) // 1513657800000
        println(cal1.getTimeInMillis) // 1513657800000

        // 2017/12/19 12:28:12
        val cal2 = new Calendar.Builder()
            .setInstant(1513657692123L)
            .build()
        println(cal2.getTime) // Tue Dec 19 12:28:12 CST 2017
        println((cal1.getTimeInMillis - cal2.getTimeInMillis).doubleValue() / (5 * 60 * 1000)) // 0.35959

        // 2017/12/19 12:20:12
        val cal3 = new Calendar.Builder()
            .setInstant(1513657212000L)
            .build()
        println((cal1.getTimeInMillis - cal3.getTimeInMillis).doubleValue() / (5 * 60 * 1000)) // 1.96

        // 2017/12/12 12:25:12
        val cal4 = new Calendar.Builder()
            .setInstant(1513052712000L)
            .build()
        println((cal1.getTimeInMillis - cal4.getTimeInMillis).doubleValue() / (5 * 60 * 1000)) // 2016.96
        println(math.ceil((cal1.getTimeInMillis - cal4.getTimeInMillis).doubleValue() / (5 * 60 * 1000))) // 2017.0
        println(7 * 24 * (60 / 5)) // 2016
    }
}
