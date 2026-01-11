package miraylalana.mg

object review_mutable_Set:

  def main(arts: Array[String]): Unit = /*
    scala.collection.mutable.Set

    random access O(1)
    */
    println("hello world")

    import scala.collection.mutable.Set as mSet
    //remove duplicates
    val set = mSet(1, 2, 3, 4, 1, 2, 3, 4)
    println(set)

    // containing O(1)
    println(set.contains(1))

    // adding single element
    set += 5
    println(set)

    // adding multiple elements O(k)
    set ++= Set(6,7,8)
    println(set)
