// 20. Write a program for Kotlin Functional Reference Example.




fun main(args:Array<String>)
{
fun isPositive(x:Int) = x > 0
val numbers = listOf(-10, -5, 0, 0, 10)
println(numbers.filter(::isPositive))
}