object ScalaLowerBoundsTest {
  def main(args: Array[String]) {

    val animal = new Animal{}
    val cat = new Cat {}
    val dog = new Dog{}
    val puppy = new Puppy{}
    val pup = new Pup
    val animalCarer = new AnimalCarer

    animalCarer.display(animal)
    animalCarer.display(cat)
    animalCarer.display(puppy)
    animalCarer.display(dog)
    animalCarer.display(pup)
    animalCarer.display()
  }
}