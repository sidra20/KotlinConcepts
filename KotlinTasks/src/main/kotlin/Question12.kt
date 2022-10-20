import java.util.Scanner

fun main(args: Array<String>) {

    var scan = Scanner(System.`in`)
    println("Enter any number")
    var decimalVal = scan.nextInt();
   // val decimal = 30
    println("Hexadecimal value is ${convertToHexa(decimalVal)}")
}

fun convertToHexa(decimal: Int): String {
    var hex:String = ""
    var num:Int = decimal
    while (num != 0) {
        var modulus = num % 16
        num /= 16
        hex = hexadecimalChars(modulus) + hex
    }
    return hex
}

fun hexadecimalChars(num: Int): String {
    if (num < 10)
    {  return num.toString()


    }
    return when (num) {
        10 -> "A"
        11 -> "B"
        12 -> "C"
        13 -> "D"
        14 -> "E"
        15 -> "F"
        else -> ""
    }
}