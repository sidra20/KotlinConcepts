import java.util.Scanner;

fun main() {
    val p1 = Point (10,20)
    val p2 = Point (10,30)
    p1.printPoint()
    p2.printPoint()
    println("\nAre they equal? ${p1.equals(p2)}")




}
class Point(x: Int, y: Int) {
    var x: Int = x
    var y: Int = y

    fun setPoint(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun printPoint() {
        println("Point coordinates are : ($x, $y)")
    }

    fun equals(c: Point): Boolean {
        return this.x == c.x &&this.y ==c.y
    }
}