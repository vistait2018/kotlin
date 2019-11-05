/**
 * Created by jyde on 11/4/2019.
 */

fun main(args:Array<String>){


    var arraylist = ArrayList<String>()

    arraylist.add("Guty")
    arraylist.add("Gutyss")
    arraylist.add("Gutyasas")
    arraylist.add("Gutyasasas")

    for(element in arraylist){
        println(element)
    }

    var arrayInt = Array<Int>(5){0}
//by object
for(element in arrayInt){
    println(element)
}

    for(index in 0..4){
        println(arrayInt[index])
    }


}








