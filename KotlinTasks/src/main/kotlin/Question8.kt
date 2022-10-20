import java.util.Scanner

fun main(args: Array<String>){

    var scan = Scanner(System.`in`)

    println("Enter first number")
    var num1:Int = scan.nextInt();
    println("Enter second number")
    var num2:Int = scan.nextInt();


    var sum: Int = num1 + num2
    println("Sum of two numberss $sum")
    var arr: IntArray = sum.toString().map{ it.toString().toInt() }.toIntArray()

    for(i in 0..arr.size-1){
        println(arr[i])
    }

    
}