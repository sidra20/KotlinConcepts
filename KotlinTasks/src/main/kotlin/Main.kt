import org.w3c.dom.css.Rect
import java.util.Scanner

fun main(args: Array<String>) {

//    decimaltoHexa()
//    palind()


//
//    val bubbleSortObj = Bubble(); //bubble class object
//
//    var myArray = arrayOf(1,2,5,3,8,23,1,33,7,17)
//    bubbleSortObj.display(myArray);   //array print
//    println("\nSorted Array values:")
//    bubbleSortObj.bubbleSort(myArray) //sorted array


//    val circle = Circle()
//    val square = Square()
//    val rect = Rectangle()
//
//    var shapes: Array<Shape> = arrayOf(circle, rect, square)
//
//    println(shapes)
}
//Question 28 (d)

//abstract class Shape{
//    abstract fun draw();
//}
//class Square : Shape()
//{
//    override fun draw() {
//        println("This is a square.")
//    }
//
//}
//class Circle: Shape()
//{
//    override fun draw() {
//        println("This is Circle.")
//    }
//}
//
//class Rectangle: Shape()
//{
//    override fun draw() {
//        println("This is Rectangle.")
//    }
//}
//Question 2
fun prime(num:Int)
{

}


//Question 1


//Question 12
fun decimaltoHexa()
{
    val reader = Scanner(System.`in`)
    println("Enter any number")
    var value:Double = reader.nextDouble()
    var hex:Double = value/16
    println(value)
    println(hex)
}

//Question 15
fun palind() {
    var value = Scanner(System.`in`)
    println("Enter a word: ")
    var word: String = value.next().toUpperCase()
    println(word)
    var revers: String = word.reversed()
    if (revers == word) {
        println("YES")
    } else {
        println("NO")
    }

}
//fun palindrome(word:String):Boolean
//{
//    val length:Int = word.length
//    for(i in 0..length/2)
//    {
//        if(word[i]!=word[length-i-1])
//        {
//            return false
//        }
//    }
//    return true
//}

//Question 8
fun add()
{
    var value = Scanner(System.`in`)
    println("Enter first number")
    var num1:Int = value.nextInt()
    println("Enter second number")
    var num2:Int = value.nextInt()

    var res:Int = num1+num2
    println("$res \n")

    var vert:Int =0;
    while(vert<=res)
    {
        vert = res%10
        res=res/10
        println(vert)
        vert = vert+1
    }

}