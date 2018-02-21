/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/
object LargestPrimeFactor {
  def Primefactor(): Unit ={
    var a = BigInt("600851475143")
    var b:Int = 2
    var c:Int=0
    while(b <= a/2){
      if(a%b == 0){
        a=a/b
        if(b>c){
          c=b
          b=2}}
      else
        b = b+1
    }
    println("largest prime factor of number 600851475143 is: "+a)
  }
  def main(args:Array[String]): Unit =  {
    Primefactor()
  }
}
