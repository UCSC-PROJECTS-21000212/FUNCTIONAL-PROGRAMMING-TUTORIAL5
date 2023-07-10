package tut5.tut5

import scala.io.StdIn
object  q4 extends App{
def isEven(n:Int):Boolean= n match{
  case 0 => true
  case _ => isOdd(n-1)
}
def isOdd(n:Int):Boolean = !(isEven(n))

  println("input a number: ")
  val num = StdIn.readInt()
  if(isEven(num)){
    println(num+" even number")
  }else {
    println(num+" odd number")
  }
}
