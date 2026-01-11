package miraylalana.mg

object review_mutable_Array:

  def main(arts: Array[String]): Unit =
    /*
    a concrete class

    mutable

    fixed size no append nor prepend

    random access O(1)
    update O(1)
    length O(1)
    */

    println("hello world")
    val array = Array(1, 2, 3, 4)
    println(array)
    // random access O(1)
    println(s"random access ${array(2)}")

    // concatenation O(n+m)
    val array2 = Vector(5, 6, 7, 8)
    val array3 = array ++ array2
    println(s"concatenation ${array3.mkString(",")}")

    // creation
    val array1 = new Array[Int](5)
    array1(0) = 100
    for (i <- array1.indices) {
      println(array1(i))
    }

    // 2D
    val array4 = Array.ofDim[Int](2, 3)
    array4(0)(1) = 100
    for (j <- array4.indices) {
      for (i <- array4(j).indices) {
        println(s"${j}, ${i} = ${array4(j)(i)}")
      }
    }





