package tut5.tut5
import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object q6 extends App {
  //declare an dynamic array
  val dynamicArray: ArrayBuffer[Int] = ArrayBuffer()
  //initialize first two numbers of fibonachi seqeunce
  dynamicArray +=0
  dynamicArray +=1

  def increaseSize(num:Int,start:Int=1): Unit = {
    val dynamicArrayLenght =dynamicArray.length
    if(num>=start){
      var sum= dynamicArray(dynamicArrayLenght-1)+dynamicArray(dynamicArrayLenght-2)
      dynamicArray +=sum
      increaseSize(num,start+1)
    }
  }

  println("input a number: ")
  val num = StdIn.readInt()
  increaseSize(num)
  println(dynamicArray)
}
