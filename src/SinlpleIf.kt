/**
 * Created by jyde on 11/1/2019.
 */



fun main(args:Array<String>){
    print("Enter grade")
    var mess:String?
    var grade = readLine()!!.toInt()
    if(grade> 89){
        grade = grade+1
        mess = "Your mark is $grade | Excellent"
    }
    else if(grade> 50 && grade <89){
        mess = "Your mark is $grade | Credit"
    }
    else{
        mess = "Your mark is $grade | Failed"
    }

    println(mess)
     //grade = readLine()!!.toInt()
}
