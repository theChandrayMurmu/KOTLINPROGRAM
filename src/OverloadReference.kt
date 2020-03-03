// 21. Write a program for Kotlin overload reference example operator(::)




fun main(args: Array<String>)
{
    fun isPositive(x: Int) = x > 0
    fun isPositive(s: String) = s == "Kotlin" || s == "Kotlin"

    val numbers = listOf(-10, -5, 0, 5, 10)
    val strings = listOf("Kotlin","Program")

    println(numbers.filter(::isPositive))
    println(strings.filter(::isPositive))
}