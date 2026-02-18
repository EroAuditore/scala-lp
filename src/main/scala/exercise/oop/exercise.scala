package exercise.oop

object exercise extends App {
  val author = new Writer("Eduardo", "Rodriguez", 1989)
  val imposter = new Writer("Eduardo", "Rodriguez", 1989)
  val novel = new Novel("Eduardo novela", 2000, author)
  println("Author age:" + novel.authorAge)
  println("isWrittenBy:" + novel.isWrittenBy(author))
  println("isWrittenBy:" + novel.isWrittenBy(imposter))

  val counter = new Counter(10)
  counter.currentCount()
  counter.increase()
  counter.currentCount()
  counter.increase(10)
  counter.currentCount()

}

class Writer(firstName: String, surName: String, val year: Int = 0) {
  //def fullName(): Unit = println("s"$firstName $surName)
  def fullName: String = s"$firstName $surName"
}

class Novel(name: String, year: Int, author: Writer) {
//  def authorAge(): Unit = {
//    val age = year - author.year
//    println(s"This is the age of the author: $age")
//  }
  def authorAge: Int = year - author.year
  //def isWrittenBy(): Unit = author.fullName()

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearRelease: Int): Novel = new Novel(name, newYearRelease, author)
}

class Counter(var counter: Int = 0) {
  def currentCount(): Unit = println(s"this is the current count: $counter")
  def increase(): Unit = {
    counter = counter + 1
  }

  def decrease(): Unit = {
    counter = counter - 1
  }

  def increase(amount: Int): Unit = {
    counter = counter + amount
  }

  def decrease(amount: Int): Unit = {
    counter = counter - amount
  }
}