package Easy

object Staircase {

  def staircase(n: Int):Unit = {
    def aux(stair: Int):Unit = {
      val spaces = " " * (n-stair)
      val hashes = "#" * stair
      if(stair <= n) {
        println(spaces + hashes)
        aux(stair + 1)
      }
    }
    aux(1)
  }

  def main(args: Array[String]): Unit = {
    staircase(6)
  }
}
