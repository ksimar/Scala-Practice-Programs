/**
  * Created by dell on 2/22/2017.
  */
class PartialTry {

  def even: PartialFunction[Int,String] = {
    case x if(x%2==0) => s"$x is even"
  }

  def odd: PartialFunction[Int, String] = {
    case x if(x%2!=0) => s"$x is odd"
  }

  var isEvenOrOdd = even.orElse(odd)
}

object Check extends App{

  var obj = new PartialTry()
  var x = 2
  if(obj.even.isDefinedAt(x)) {
   println(obj.even(x))
  }
  else
   println(obj.odd(x))

  var y = 3
  println("Result is "+obj.isEvenOrOdd(y))

}

