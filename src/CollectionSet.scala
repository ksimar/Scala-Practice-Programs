import scala.collection.immutable.HashSet
import scala.collection.mutable
//import scala.collection.mutable.Set

/**
  * Created by dell on 2/12/2017.
  */
class CollectionSet{
  def method1(b: Int) = {
  //  b= b+1
  }
}

object CollectionSet extends App {
  val hashSet = new HashSet[String]
  val set = mutable.Set("Aman","Simar")
  println(set)
  set+="Silky"
  println(set)
  println(set.contains("Silky"))

  var myHashSet = HashSet("Simar", 1)
  println(myHashSet)

  val padding = "a" * 3
  println("padding : "+padding)

  val raw=
    """|Welcome
       |hello
    """.stripMargin
  println(raw)

  println(null == null)
}
