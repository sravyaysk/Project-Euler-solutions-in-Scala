/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
import scala.util.control.Breaks._

object PythagoreanTriplet {
  def computeTriplet(): Unit = {
    var i: Int = 0
    var j: Int = 0
    var k: Int = 0
    breakable {
      for (i <- 1 to 1000) {
        for (j <- i to 1000) {
          k = 1000 - i - j
          if (k > 0) {
            if (k * k == i * i + j * j)
              println(i * j * k)
          }
          break
        }
      }
    }
  }
  def main(args:Array[String]): Unit = {
    computeTriplet()
  }
}
