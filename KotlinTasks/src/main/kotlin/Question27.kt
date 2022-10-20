fun main(args: Array<String>) {
    val obj = Distance(10.5, 100);
    val obj2 = Distance(10.5, 100);
    val obj3 = Distance(5.5, 1000);
    println("Is distance one and two equals? ${obj.equals(obj2)}")
    println("Distance one is: ${obj.detail()}")
    println("Distance two is: ${obj2.detail()}")

    println("\nIs distance one and three equals? ${obj.equals(obj3)}")
    println("Distance one is: ${obj.detail()}")
    println("Distance three is: ${obj3.detail()}")
}

class Distance(var km: Double, var meter: Int) {

    fun equals(dist: Distance): Boolean {
        return this.km == dist.km && this.meter == dist.meter
    }

    fun detail(): String {
        return "$km km and $meter m"
    }
}