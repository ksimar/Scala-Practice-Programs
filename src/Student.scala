/**
  * Created by dell on 2/22/2017.
  */
abstract case class Student private(name: String, gender: String) {
  override def toString(): String ={
    s"Hello ${this.gender} ${this.name}"
  }
}

object Student {

   def apply( name: String, gender: String) = {
    if(gender.toLowerCase == "male") {
      val g = "Mr. "+name
      new Student(name,g){}
    }
    else {
      val g = "Miss "+name
      new Student(name,g){}
    }
  }



}
