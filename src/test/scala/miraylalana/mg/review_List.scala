package miraylalana.mg

object review_List:

  def main(arts: Array[String]): Unit =
    // scala.collection.immutable.List
    // like a single linked list from head only
    // use when frequent prepend
    println("hello world")
    var list = List(1, 2, 3, 4)
    println(s"list.head ${list.head}")
    println(s"list.tail ${list.tail}")

    // add new value
    list = list.::(5) // add in front
    println(s"list ${list}")

    list = 5 :: list
    println(s"list ${list}") // add in front too

    list = list :+ 6 // add at the end // O(n) inefficient
    println(s"list ${list}")

    list = 6 +: list // add in front O(1)
    println(s"list ${list}")
    
    