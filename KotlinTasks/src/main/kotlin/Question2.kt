import java.util.Scanner

fun main(args: Array<String>) {

    var primeObj = Primenumber();
    println("\n**** Prime numbers between 1 to 100 ****")
    for(i in 1..100)
    {
        if(primeObj.prime(i))
        {
            var primeArray = arrayOf(i)

            for(z in primeArray)
            {
                print("$z ")
            }

        }
    }

}

class Primenumber{
    fun prime(num:Int):Boolean
    {
        if(num<=1)
        {
            return false
        }
        for (j in 2 until num)
        {
            if(num%j==0)
            {
                return false
            }
        }
        return true
    }
}