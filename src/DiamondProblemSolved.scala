/**
  * Created by dell on 1/21/2017.
  */

trait A{
  def show = println("Its A")
}
trait B extends A{
  override def show = println("Its B")
}

trait C extends A{
  override def show = println("Its C")
}
class D extends B with C
class E extends C with B
class F extends A
class G extends A with B
class H extends A with B with C
class I extends C with B with A
object DiamondProblemSolved {

 def main(args: Array[String]) {
   val d = new D()
   d.show
   val e = new E()
   e.show
   val f = new F()
   f.show
   val g = new G()
   g.show
   val h = new H()
   h.show
   val i = new I()
   i.show
 }
}