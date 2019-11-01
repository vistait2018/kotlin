/**
 * Created by jyde on 11/1/2019.
 */


fun main(args:Array<String>){


    print("enter day of the Week: ")
    var x:Int = readLine()!!.toInt();

    when(x){
        1 ->{print("value is Monday")}
        2 ->{print("value is Tuesday")}
        3 ->{print("value is Wednesday")}
        4 ->{print("value is Thursday")}
        5 ->{print("value is Friday")}
        6 ->{print("value is Saturday")}
        7 ->{print("value is Sunday")}
        else ->{print("value out of range")}
    }
}
