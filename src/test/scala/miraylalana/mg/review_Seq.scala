package miraylalana.mg

object review_Seq:

  def main(arts: Array[String]): Unit =
    /*
    a trait, not a concrete class
    default implementation is a List

    scala.collection.immutable.Seq
    ├── extends scala.collection.Seq
    ├── extends scala.collection.Iterable
    └── implemented by:
        ├── List
        ├── Vector
        ├── Range
        ├── Stream
        └── ArraySeq
    *
    Performance consideration
    if List
    prepend 0(1)
    append O(n)
    random access 0(n)

    if Vector
    prepend O(1)*
    append O(1)*
    random access O(log n)
    *
    *
    *
    *
    *
    *
    * */


    println("hello world")
    val seq = Seq(1, 2, 3, 4)
    println(seq)


