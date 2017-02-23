import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
/**
  * Created by dell on 2/23/2017.
  */
class FutureArmstrong {

  def calculate(num: Int): Future[Boolean] = Future {
    def sum(num: Int, initial: Int): Int = {
      if(num==0) initial
      else {
        val rem = num % 10
        val sumOfNum = initial + (rem * rem * rem)
        val r = num / 10
        sum(r, sumOfNum)
      }
    }
    if(sum(num,0)==num) true
    else false
  }
}
