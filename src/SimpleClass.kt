/**
 * Created by jyde on 11/5/2019.
 */


class Car(){
    var color:String? = null
    var name:String? = null
    var price:Double? = null


    init{
        println("Car Class Starting")
    }
    constructor(color:String,name:String,price:Double):this(){
        this.color = color
        this.name = name
        this.price = price
    }

}





fun main(args:Array<String>){

     var car = Car("white","Pasat",12345.89)
    println("Car Color"+car.color)



}
