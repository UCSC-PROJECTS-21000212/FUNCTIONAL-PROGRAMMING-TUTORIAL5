package tut5.tut5

import scala.io.StdIn

object q5 extends App{
    var sum=0;
  //indirect recursive
    def even(n:Int):Boolean= n match{
      case 0 => true
      case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean = !(even(n))

  def addtion(num:Int,start:Int=1):Unit={
    if(start<=num && even(start)){
      sum=sum+start
      addtion(num, start+1)
    }else if(start<=num) addtion(num, start+1)
    if(start>num){
      println(sum)
    }
  }

  println("input a number: ")
  val num = StdIn.readInt()
  addtion(num)

}
