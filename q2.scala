package tut5.tut5
import scala.io.StdIn;
object q2 extends App{

  def GCD(x: Int, y: Int): Int = y match {
    case 0 => x
    case _ => GCD(y, x % y)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p) => true
    case x if GCD(p, x) > 1 => false
    case x => prime(p, x + 1);
  }

  def primeSeq(num: Int, start: Int = 2): Unit = {
    if (start <= num && prime(start)) {
      println(start)
      primeSeq(num, start + 1)
    }
    else if (start <= num) primeSeq(num, start + 1)
  }

  println("input a number: ")
  val num = StdIn.readInt()
   primeSeq(num)

}
