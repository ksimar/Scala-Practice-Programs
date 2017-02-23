/**
  * Created by dell on 2/23/2017.
  */
class TailRecursion {

  def concat(list1: List[Int], list2: List[Int]): List[Int] = {

    (list1,list2) match {
      case (Nil,Nil) => Nil
      case (x,Nil) => x
      case(Nil,x) => x
      case(x,y::ys) => {
        concat((y :: x.reverse).reverse, ys)
      }
    }
  }

  def concatBetter(list1: List[Any], list2: List[Any]): List[Any] = {
    val list= List[Nothing]()

    def concatList(list: List[Any], elem: Any): List[Any]= {
      val resList = elem :: list
      concatList(resList,)
    }
  //  concatList(list,)
    for(a <- 0 to  list1.length)yield{
      concatList(Nil,list1(i))
    }
    for(a <- 0 to  list2.length)yield{
      concatList(Nil,list1(i))
    }

  }

}
