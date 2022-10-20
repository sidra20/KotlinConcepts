import java.util.Scanner

fun main(args: Array<String>) {

    val obj = MinMax();
    var arr = arrayOf(1,4,3,5,6,7,8,9,34,45)

    obj.printArray(arr)
    obj.maxValue(arr)
    obj.minValue(arr)

}

class MinMax{
    fun printArray(myArr:Array<Int>)
    {
        for(i in myArr)
        {
            println(i)

        }

    }
    fun minValue(myArr:Array<Int>)
    {
        var max:Int = myArr[0]
        var j:Int =1;
        while(j<myArr.size)
        {
            if(max<myArr[j])
            {
                max=myArr[j]
            }
            j=j+1
        }
        println("\n Maximum value is : $max")
    }
    fun maxValue(myArr:Array<Int>)
    {
        var min:Int = myArr[0]
        var k:Int = 1
        while(k<myArr.size)
        {
            if(min>myArr[k])
            {
                min=myArr[k]
            }
            k=k+1
        }
        println("\n Minimum value is : $min")
    }
}