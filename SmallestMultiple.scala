/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/

object SmallestMultiple {
  def generateMultiple(): Unit ={
    var check_list = List(11, 13, 14, 16, 17, 18, 19, 20)
    def solution(num:Int):Any={
      for(i <- num until 999999999 by num)
        if(check_list.forall(num % _==0))
          num
      None
    }
    var res=solution(20)
    if(res == None)
      println("No answer found")
    else
      println("answer is "+res)
  }
  def main(args:Array[String]): Unit = {
    generateMultiple()
  }
}
