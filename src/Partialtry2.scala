
class Partialtry2 {

  def even = new PartialFunction[Int, String]{
    override def apply(v1: Int) = {
      s"$v1 is even"
    }

    override def isDefinedAt(x: Int) = {
      x%2==0
    }
  }

}

object PartialCheck extends App {

  var obj = new Partialtry2();
  var x = 4;
  if(obj.even.isDefinedAt(x)){
    println(obj.even(x))
  }
  else println("Function is not defined here")

}

