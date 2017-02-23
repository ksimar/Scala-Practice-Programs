
class factorialBigInt {
  def factorialInt(x: Int): Int = {
    if(x==0) 1
    else factorialInt(x-1)*x;
  }

  def factorialBig(x: BigInt): BigInt = {
    if(x==0) 1
    else factorialBig(x-1)*x;
  }
}

object factorialBigInt {
  def main(args: Array[String]): Unit = {
    val obj = new factorialBigInt()
    println(obj.factorialBig(30))
    println(obj.factorialInt(30))
  }
}
