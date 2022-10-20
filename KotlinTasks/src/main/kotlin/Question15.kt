import java.util.Scanner

fun main(args: Array<String>) {

    var scan = Scanner(System.`in`)
    println("Enter any word")
    var value = scan.next().toUpperCase();
    var result = palindrome(value)
    if(result)
    {
        println("Is $value palindrome?")
        println("YES")
    }
    else{
        println("Is $value palindrome?")
        println("NO")
    }
}

fun palindrome(word:String):Boolean
{
    val length:Int = word.length
    for(i in 0..length/2)
    {
        if(word[i]!=word[length-i-1])
        {
            return false
        }
    }
    return true
}