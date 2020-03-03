// 23. Write a program to Primary Constructor with Initializer Block.


class myClass(name: String, id: Int) {
    val e_name: String
    var e_id: Int

    init {
        e_name = name.capitalize()
        e_id = id

        println("Name = ${e_name}")
        println("Id = $e_id")
    }
}

fun main(args: Array<String>) {
    val myclass = myClass("Mr.Moon", 50)
}