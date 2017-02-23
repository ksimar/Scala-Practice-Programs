/**
  * Created by dell on 2/22/2017.
  */
class ListTry {


}

object ListTry extends App {
  val list = List(1,2,3,4)
  println(list.isDefinedAt(4))
  if(list.isDefinedAt(3)) {
    println(list.andThen("Present"))
  }
 // println(list.orElse())
}
