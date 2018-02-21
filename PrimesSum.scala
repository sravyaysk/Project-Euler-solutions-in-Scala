/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/
import scala.collection.mutable

object PrimesSum {
  def main(args:Array[String]): Unit = {
    var obj1 = new PrimeNums()
    obj1.findPrimeNums(2000000)
  }
}
class PrimeNums{
  def findPrimeNums(n:Int): Unit ={
    var sum:Int=0
    var i:Int=0
    var prime = mutable.Buffer.fill(n)(true)
    var p:Int=2
    while(p*p <= n){
      if(prime(p-1)){
        for(i <- p*2 to n by p){
          prime(i-1)=false
        }
      }
      p = p+1
    }
    for(p <- 2 to n) {
      if (prime(p - 1))
        sum = sum + p
    }
    println(sum)
  }
}
