/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/

object LargestPalindromeProduct {
  def myLogic(): Unit ={
    var i:Int=100;
    var j:Int=1000;
    var prev:Int=0;
    var curr:Int=0;
    for(x <- i to j)
      for(y <- i to j)
        if((x*y).toString == (y*x).toString.reverse)
          curr=(x*y)
    if(curr>prev)
      prev=curr
    println(prev)
  }
  def main(args:Array[String]): Unit = {
    myLogic()
  }
}
