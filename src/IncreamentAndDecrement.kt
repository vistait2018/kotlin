/**
 * Created by jyde on 11/1/2019.
 */
/**
 * Oreations Rules
 * 1 ()
 * 2 ^
 * 3 * , /
 * 4 + ,-
 * 5 =
 * 6 ++ ,--
 */

fun main(args:Array<String>){
    var x = 10;
    var y = 11;
    var z = ++x+y //(++x) = (x= x+1), (--x) = (x= x-1)
    println(z);
}