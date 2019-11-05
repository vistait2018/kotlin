/**
 * Created by jyde on 11/5/2019.
 */


open class Operations(){


    fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
}


class MultiOpreation():Operations(){

    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
}


fun main(args:Array<String>){
   val op = Operations()
    val mul = MultiOpreation()
    println("Add : " + op.sum(20,30))
    println("Add from Multi : " + mul.sum(20,30))
}