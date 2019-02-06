package Easy

object AVeryBigSum {
  // Complete the aVeryBigSum function below.
  def aVeryBigSum(ar: Array[Long]): Long = {
    ar.fold(0:Long)(_+_)
  }

  def main(args: Array[String]): Unit = {

    val arr = Array[Long](1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    println(aVeryBigSum(arr))
  }
}
