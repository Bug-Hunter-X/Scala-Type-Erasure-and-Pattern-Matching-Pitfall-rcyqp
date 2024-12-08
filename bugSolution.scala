```scala
trait MyTypeClass[T] {
  def operate(x: T, y: T): T
}

object MyTypeClassInstances {
  implicit val intInstance: MyTypeClass[Int] = new MyTypeClass[Int] {
    override def operate(x: Int, y: Int): Int = x + y
  }
  implicit val stringInstance: MyTypeClass[String] = new MyTypeClass[String] {
    override def operate(x: String, y: String): String = x + y
  }
}

class MyClass2[T](val value: T)(implicit tc: MyTypeClass[T]) {
  def myMethod(x: T): T = tc.operate(x, value)
}

val myIntInstance2 = new MyClass2[Int](5)
val myStringInstance2 = new MyClass2[String]("hello")

println(myIntInstance2.myMethod(3)) // 8
println(myStringInstance2.myMethod(" world")) // hello world
```