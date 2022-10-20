import java.util.Arrays

fun main(args: Array<String>) {

    var circle = Circle();

    var square = Square ();
    var rect = Rectangle ();
    var arr : Array<Shape> = arrayOf(circle,square,rect);
    for(j in arr)
    {
        println(j.draw())

    }
    //
    //Draw(circle.draw())
}

open class Shape {
    open fun draw(){
        println("I am shape")

    }

}
class Circle:Shape() {
    override fun draw(){
        println("I am Circle")

    }

}
class Square:Shape() {
    override fun draw()
    {
        println("I am Square")

    }

}
class Rectangle: Shape(){
    override fun draw(){
        println("I am Rectangle")

    }

}

//Question