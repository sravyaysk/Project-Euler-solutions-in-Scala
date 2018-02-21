/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000*/
object Multiplesof3and5 {
  def Multiples(): Unit ={
    var sum:Int = 0;
    var i:Int=0;
    var lower_limit:Int=1;
    var upper_limit:Int=1000;
    for(i <- lower_limit to upper_limit-1)
      if(i%3==0 || i%5==0)
        sum = sum + i
    println("sum of all the numbers between "+lower_limit+" and "+upper_limit+" which are multiples of 3 and 5 is: "+sum)
  }
  def main(args:Array[String]): Unit =  {
    Multiples()
  }
}
