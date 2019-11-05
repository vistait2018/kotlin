/**
 * Created by jyde on 11/5/2019.
 */

fun sum(n1:Double, n2:Double):Double{
    var sum = n1+n2
    return sum
}

fun display(ni:String):Unit{
    println(ni)
}

fun  dofor():Unit{
    display("Hello World dofor")
}


fun main(args:Array<String>){
    var r = sum(20.5 ,30.34)
    println("r: $r");
    display("Hello World")
    dofor()
}

// function can be overloaded



