import java.util.Random
import java.util.Scanner

fun main(args: Array<String>) {



    val obj = MyClass();
    var myArray = IntArray(10){Random().nextInt(100)}

    obj.print(myArray)
    obj.bubbleSort(myArray)

    val reader  = Scanner(System.`in`);
    println("\nSearch for a value")
    var inp:Int = reader.nextInt();
    val index=obj.binarySearch(myArray,inp)
    if(index!=-1) println("The value $inp is in the sorted array at index $index") else println("Value not found")

}

class MyClass{
    fun print(arr:IntArray) {
        println("Array is:")
        for (i in arr) {
            println(i)
        }
    }

    fun bubbleSort(arr:IntArray)
    {

        println("\nSorted Array")
        for(i in 0 until arr.size-1)
        {
            for(j in 0 until (arr.size-i-1))
            {
                if(arr[j]>arr[j+1])
                {
                    var swap:Int = arr[j]
                    arr[j]=arr[j+1]
                    arr[j+1]=swap


                }
            }

        }
        for(i in 0 until arr.size)
        {
            println(arr[i])
        }


    }
    fun binarySearch(arr: IntArray, value:Int):Int
    {
         var low=0
        var high=arr.size-1
        while(low<=high)
        {
            var mid = low+(high-low)/2
            if(arr[mid]==value )
            {
                return mid
            }
            if(arr[mid]<value)
            {
                low=mid+1
            }
            else{
                high = mid-1
            }
        }
        return -1
    }
}