import java.util.Scanner

fun main(args: Array<String>) {
    val bubbleSortObj = Bubble(); //bubble class object

    var myArray = arrayOf(1,2,5,3,8,23,1,33,7,17)
    bubbleSortObj.display(myArray);   //array print
    println("\n\n****Sorted Array values:***")
    bubbleSortObj.bubbleSort(myArray) //sorted array

}

class Bubble{
    fun bubbleSort(arr: Array<Int>)
    {
        for(i in 0 until (arr.size))
        {
            for(j in 0 until (arr.size-i-1))
            {
                if(arr[j]>arr[j+1])
                {
                    var swap = arr[j]
                    arr[j]=arr[j+1]
                    arr[j+1]=swap
                }

            }
            print("${arr[i] }  ")
        }

    }

    fun display(arr:Array<Int>)
    {
        println("\n***Array Values:***")
        for (i in arr)
        {
            print("$i  ")
        }
    }
}