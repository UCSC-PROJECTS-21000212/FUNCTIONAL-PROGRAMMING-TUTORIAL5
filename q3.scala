package tut5.tut5
import scala.io.StdIn;
object q3 extends App {
  var sum=0
  def sum(num:Int,start:Int =1): Int = {
    if(start<=num){
      sum=sum+start;
      sum(num, start+1)
    }else{
      return sum
    }
  }
  println("input a number: ")
  val num = StdIn.readInt()
  var nn=sum(num)
  println(nn)
}
