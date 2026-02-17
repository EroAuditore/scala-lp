package lectOO

object objectbasics extends App {

  val person = new Person("Edu", 36)

  println(person.age)

  person.greet("Ehecatl")
  person.greet()
}

// constructor
class Person(name: String, val age: Int) {
  //body
  val x = 2
  println( 1 + 3 )
  //methods
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")
  //overload method
  def greet(): Unit = println(s"Hello workd says: $name")

  //multiple contructors
  def this(name: String) = this(name, 0)
}
