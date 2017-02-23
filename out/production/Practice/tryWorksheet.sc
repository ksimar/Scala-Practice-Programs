//implicit def doubleToInt(a: Double): Int = a.toInt
//implicit def intToString(a: Int): String = a.toString

implicit def doubleToInt(a: Double): Int= (a*5).toInt
implicit def intToString(a: Int): String= (a+5).toString

//def f(a: Double): String = a
//f(4)

//
//def func(): Tuple2[A,B] = {
//
//}

val tuple = (1,2,3,4)
tuple._1

implicit def doubleToString2(a: Double): Int = a.toInt

//def f(a: Double): Int = a
//f(1)

class Name(implicit val age: Int)
val name = new Name()






