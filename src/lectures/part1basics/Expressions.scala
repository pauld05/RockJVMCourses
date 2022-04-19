package lectures.part1basics

object Expressions extends App {
  println(1 + 2)

  val x = 1 + 4 * 3
  println (x)

  println(x == 3)
  // == != >= <=

  println(!(x == 3))

  var aVariable = 3
  aVariable += 1
  println(aVariable)

  // Instructions vs Expressions

  // IF Expression
  val aCondition = false
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  var aVariableString = ""
  if (5 > 3 ) aVariableString = "This is true" else aVariableString = "This is false"

  println(aVariableString)


}
