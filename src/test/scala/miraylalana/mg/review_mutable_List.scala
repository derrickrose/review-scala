package miraylalana.mg

object review_mutable_List:

  def main(arts: Array[String]): Unit =
    // scala.collection.mutable.ListBuffer
    println("hello world")

    import scala.collection.mutable.ListBuffer as mList
    val list = mList(1, 2, 3, 4)
    println(list)

    list += 9 //O(1)

    println(list)
    list.prepend(0) // O(1)
    println(list)

    list.insert(2, 5) //O(n)
    println(list)


    println(list)