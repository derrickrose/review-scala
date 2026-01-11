package miraylalana.mg

object review_mutable_Map:

  def main(arts: Array[String]): Unit = /*
    scala.collection.mutable.Map



    random access O(1)
    */
    println("hello world")

    import scala.collection.mutable.Map as mMap

    // remove key duplication
    // well better update the value if inserted in the same key
    val map = mMap(1 -> "a", 2 -> "b", 3 -> "c", 4 -> "d", 1 -> "e", 2 -> "f", 3 -> "g", 4 -> "h")
    println(map)

    // containing O(1)
    println(map.contains(1))

    // add  or update
    map(4) = "4"
    println(map)

    // add element
    map += 5 -> "5"
    println(map)

    map += 5 -> "6"
    println(map)

    //remove element
    map -= 4
    println(map)
