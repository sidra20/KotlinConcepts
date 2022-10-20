import java.util.*

fun main(args: Array<String>) {
//    val stack = Stack<Int>()
//    for (i in 0..9)
//        stack.push(Random().nextInt(50))
//    println("Stack: $stack")
//    stack.pop()
//    println("Stack: $stack")
//    println("Peek: ${stack.peek()}")
//    println("Stack: $stack")
   val li = mutableListOf<Int>();
    for(i in 0..9)
    {
        li.add(Random().nextInt(50))
    }

    for (j in li)
    {
        println(j)
    }
    val obj = Stack(li)
    println("\nPeek ${obj.peek()}")

    obj.push(79)
    println("After push an item:")

    for (j in li)
    {
        println(j)
    }

    obj.pop()
    println("After pop :")

    for (j in li)
    {
        println(j)
    }


}

class Stack(var stack :MutableList<Int>){

    fun empty():Boolean
    {
        return stack.isEmpty()

    }
    fun push(item :Int): Boolean {
        return stack.add(item)
    }
    fun peek(): Int?
    {
        return stack.lastOrNull()
    }

    override fun toString(): String {
        return stack.toString()
    }
    fun pop():Int?{
        val item = stack.lastOrNull()
        if (!empty()){
            stack.removeAt(stack.size -1)
        }
        return item
    }
}