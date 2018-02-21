/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/

object SumSquareDiff {
  def computeDiff(): Unit ={
    var n:Int=100;
    var sum1:Int=0;
    var sum2:Int=0;
    var i:Int=0;
    for(i <- 1 to n) {
      sum1 = sum1 + (i * i)
      sum2 = sum2 + i
    }
    println("sum1: "+sum1+" sum2: "+sum2)
    var sum = sum2*sum2
    println("sum: "+sum)
    var diff:Int = (sum-sum1)
    println(diff)
  }
  def main(args:Array[String]): Unit = {
    computeDiff()
  }
}
