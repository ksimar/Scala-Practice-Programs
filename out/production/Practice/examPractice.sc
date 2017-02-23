implicit val x = 1
val sum = x+1
implicit val y = 2
implicit def intToDouble(a: Int): Double = {
  s"intToDouble called"
  a.toDouble
}
implicit def doubleToString(a: Double): String = {
  s"doubleToString called"
  a.toString
}
def f(a: Int): String = a

f(2)
implicit def int1ToDouble(a: Int): Double = {
  s"intToDouble called"
  a.toDouble
}

println("Helo")





