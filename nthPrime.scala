/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10001st prime number?*/
object nthPrime{
  def isPrime(n: Int): Boolean ={
    if(n==2)true
    if(n%2==0||n==1)false
    var limit:Double=math.sqrt(n)
    for(i <- 3 until limit.toInt by 2)
      if(n%i==0)false
    true
  }
  def main(args:Array[String]): Unit =  {
    var count:Int=1
    var i:Int=3
    while(count < 10001){
      if(isPrime(i))count=count+1
      i=i+2
    }
    println(i-2)
  }
}


