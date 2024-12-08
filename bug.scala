```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    value match {
      case _: Int => x + value.asInstanceOf[Int]
      case _: String => x + value.asInstanceOf[String]
      case _ => x
    }
  }
}

val myIntInstance = new MyClass[Int](5)
val myStringInstance = new MyClass[String]("hello")

println(myIntInstance.myMethod(3)) // 8
println(myStringInstance.myMethod(" world")) // hello world
```