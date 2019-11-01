import java.util.*

/**
 * Created by jyde on 11/1/2019.
 */

fun main(args:Array<String>){
   var year = Calendar.getInstance().get(Calendar.YEAR)

    //input
    print("Enter your DOB")
    var DOB:Int = readLine()!!.toInt()

    var age:Int?
    age= year- DOB

    println("Your age is $age years.")

}
