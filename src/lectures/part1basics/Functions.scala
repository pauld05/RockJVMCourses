package lectures.part1basics

object Functions extends App {
  def aFunction(a:String, b:Int):String =
    a + " " + b

  println(aFunction("Hello, this is my", 4))

  def aRecursiveFunction(aWord: String, aNumber: Int): String =
    if(aNumber == 1) aWord
    else aWord + aRecursiveFunction(aWord, aNumber - 1)

  println(aRecursiveFunction("Paul", 4))

  def aGreatingFunction(aName: String, aAge: Int): Unit = {
    println(s"Hello my name is $aName and I am $aAge years old")
  }
  aGreatingFunction("Paul", 36)

  def aFactorialFunction(n: Int): Int = {
    if(n <= 0) 1
    else n * aFactorialFunction(n-1)
  }

  println("El Factorial "+ aFactorialFunction(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(8))

  def isPrime(num: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else num % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(num / 2)
  }

  println(isPrime(8))
}