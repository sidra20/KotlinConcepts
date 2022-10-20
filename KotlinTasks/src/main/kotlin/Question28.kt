import java.util.Scanner;

fun main(args: Array<String>) {
    val obj = Calculate ()
    obj.add(2,3)
    obj.sub(5,2)

    println("Addition ${obj.add(2.0,3.5,3.0)}")


}

class Calculate {

    fun add(a:Int , b:Int)
    {
        var res:Int = a+b;
        println("Sum of $a and $b is $res")

    }
    fun sub(a:Int, b:Int)
    {
        var res:Int = a-b;
        println("Subrtraction of $a and $b is $res")

    }
    fun add(a:Double, b: Double, c:Double):Double{
        var res:Double = a+b+c;
        return res

    }


}


