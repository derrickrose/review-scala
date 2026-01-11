package miraylalana.mg

object Exam :

  def countPeaks(values: List[Double]): Int = {
    var peaks = 0
    for (index <- 1 until (values.length - 1)) {

      val previous = values(index - 1)
      val value = values(index)
      val next = values(index + 1)
      // peak superior value - value0 > 5
      if (((value - previous) >= 5) && ((value - next) >= 5)) {
        peaks += 1
      }
        // peak inferior value - value0 < -5
      if (((value - previous) <= -5) && ((value - next) <= -5)) {
        peaks += 1
      }
    }
    peaks
  }

  def main(args: Array[String]): Unit =
    println("hello world")

    val a = 10.5
    val b = 1
    println(a -b )
    val c = Seq(8,10.7,17.1,11.2,13.5,9.9,14.9,9.4,9.4,3.1,12.7).toList
    println(countPeaks(c.toList))
    println(c.indices)
    println(c.length)

    for (index <- Seq(0,1,2).indices){
      println(index)
    }



