import java.lang.ArithmeticException

fun main(args: Array<String>) {

    try {
        var a = 2/0
        println(a)

    }
    catch (e:ArithmeticException ){
        println("No number can be divisible by 0 \n ${e.message}")
    }
    finally {
        println("Array world")
    }
}
