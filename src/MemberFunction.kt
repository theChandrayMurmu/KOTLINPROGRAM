// 22. Write a program to create access the class property and member function using operator.





class Account
{
    var acc_no: Int = 0
    var name: String = ""
    var amount: Float = 0.toFloat()
    fun insert(ac: Int, n:String, am:Float)
    {
        acc_no = ac
        name = n
        amount = am
        println("Account no:$")
    }
}