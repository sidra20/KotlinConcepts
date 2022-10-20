fun main() {

        val node1 = Node(value = "Name: Sidra, Course: Android", )
        val node2 = Node(value = "Name: Maham , Course: Android")
        val node3 = Node(value = "Name: Samra , Course: Python")

        node1.next = node2
        node2.next = node3

        println(node1)

    val list = LinkedList<Int>()


    var index = 2
   // val removedValue = list.removeAfter(index)

  //  println("After removing at index $index: $list")
    //println("Removed value: $removedValue")

    }



data class Node<T>(var value: T, var next:Node<T>?=null)
{
    override fun toString(): String {
       if (next != null) {
           return  "$value -> ${next.toString()}"
        } else {
           return  "$value"
        }
    }
}

class LinkedList<T> {

     var head: Node<T>? = null
     var tail: Node<T>? = null
     var size = 0

    fun empty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (empty()) {
            return "Empty list"
        } else {
            return head.toString()
        }
    }

    fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value

        if (node.next == tail) {
            tail = node
        }

        if (node.next != null) {
            size--
        }

        node.next = node.next?.next
        return result
    }
}

