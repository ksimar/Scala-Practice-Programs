/**
  * Created by dell on 2/23/2017.
  */
trait Animal
trait Cat
trait Dog extends Animal
trait Puppy extends Dog
class Pup extends Cat

class AnimalCarer{
  def display [T >: Dog](t: T){
    println(t)
  }
}


