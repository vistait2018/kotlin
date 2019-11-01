/**
 * Created by jyde on 10/28/2019.
 */

fun main(args:Array<String>){
  print("Enter your Name:");
  var name = readLine();

  print("Enter age:")
  var age = readLine()!!.toInt();


  print("Enter PI:");
  var pi = readLine()!!.toDouble();


  print("Enter Department:");
  var dep = readLine();

  println("name:" + name);
  println("name:" + age);
  println("departemnt:" + dep)
  println("pi:" + pi);


}