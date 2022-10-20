import java.util.Random
import java.util.Scanner

fun main(args: Array<String>) {



    val bubbleSortObj = Bubble(); //bubble class object

    var myArray2 = IntArray(10){Random().nextInt(10)}
//    //var myArray = arrayOf(1,2,5,3,8,23,6,33,7,17)
    bubbleSortObj.display(myArray2);   //array print
    println("\n\n****Sorted Array values:***")
    bubbleSortObj.bubbleSort(myArray2) //sorted array

}

class Bubble{
    fun bubbleSort(arr: IntArray)
    {
        for (i in 0 until  arr.size-1) {
            for (j in 0 until  arr.size-i-1) {
                if (arr[j] > arr[j + 1]) {
                    val swap = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = swap
                }
            }
        }
        for (i in 0 until arr.size) {
            print("${arr[i]}  ")
        }


    }

    fun display(arr:IntArray)
    {
        println("\n***Array Values:***")
        for (i in arr)
        {
            print("$i  ")
        }
    }
}