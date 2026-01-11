package miraylalana.mg

object review_Vector:

  def main(arts: Array[String]): Unit =
    /*
    a concrete class

    scala.collection.immutable.Vector
    ├── extends scala.collection.immutable.AbstractSeq
    ├── implements scala.collection.immutable.IndexedSeq
    ├── implements scala.collection.immutable.Seq
    └── extends scala.collection.Iterable

    *
    Performance consideration

    prepend O(1)*
    append O(1)*
    random access O(log n)
    length 0(1)
    *
    * */
    println("hello world")
    val vector = Vector(1, 2, 3, 4)
    println(vector)
    // random access O(log n)
    println(s"random access ${vector(2)}")

    // concatenation O(n+m)
    val vector2 = Vector(5, 6, 7, 8)
    val vector3 = vector ++ vector2
    println(s"concatenation ${vector3}")

    // random update O(log n) update in the middle
    val vector4 = vector.updated(0, 100)
    println(s"random update ${vector4}")


