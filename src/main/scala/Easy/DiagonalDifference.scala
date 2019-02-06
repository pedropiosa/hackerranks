package Easy

import scala.math._
object DiagonalDifference {
  // Complete the diagonalDifference function below.
  def diagonalDifference(arr: Array[Array[Int]]): Int = {

    def aux(left: Int, right: Int, i: Int): Int ={
      if(i == arr.size) abs(left - right)
      else aux(left + arr(i)(i), right + arr(i)(arr.size - i - 1), i+1)
    }
    aux(0,0,0)
  }

  def main(args: Array[String]): Unit = {
    val arr = Array[Array[Int]](Array(1,1,5),Array(2,2,2),Array(7,3,-7))
    print(diagonalDifference(arr))

  }
}
