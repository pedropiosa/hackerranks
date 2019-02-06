package Easy
import scala.BigDecimal._

object PlusMinus {
  def plusMinus(arr: Array[Int]) {
    var neg,pos, zero = BigDecimal(0).setScale(6)
    for (i <- 0 to arr.size - 1) {
      if(arr(i) < 0) neg = neg + 1
      else if(arr(i) == 0) zero = zero + 1
      else pos = pos + 1
    }
    println((pos/arr.size).setScale(6,BigDecimal.RoundingMode.HALF_DOWN))
    println((neg/arr.size).setScale(6,BigDecimal.RoundingMode.HALF_DOWN))
    println((zero/arr.size).setScale(6,BigDecimal.RoundingMode.HALF_UP))
  }

  def main(args: Array[String]): Unit = {
    plusMinus(Array(-4 ,3 ,-9 ,0 ,4,1))
  }
}
