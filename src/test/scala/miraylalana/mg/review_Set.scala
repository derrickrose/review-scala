package miraylalana.mg

object review_Set:

  def main(arts: Array[String]): Unit = /*
    scala.collection.immutable.Set
├── trait (NOT a concrete class)
├── extends scala.collection.Set  
├── extends scala.collection.Iterable
└── implemented by:
    ├── EmptySet (0 elements)
    ├── Set1 (1 element)
    ├── Set2 (2 elements)  
    ├── Set3 (3 elements)
    ├── Set4 (4 elements)
    └── HashSet (5+ elements)

    immutable

    random access O(1)
    */
    println("hello world")

    //remove duplicates
    val set = Set(1, 2, 3, 4, 1, 2, 3, 4)
    println(set)

    // containing O(1)
    println(set.contains(1))

    // adding single element
    val set1 = set + 5
    println(set1)
