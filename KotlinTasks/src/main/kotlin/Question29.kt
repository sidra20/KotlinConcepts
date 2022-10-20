
fun main(args: Array<String>) {

    val v1= Valentine ()
    val b1 = Birthday ()
    val h1 = Holiday ()
    v1.greeting()
    h1.greeting()
    b1.greeting()
}
open class Card{
    open fun greeting()
    {
        println("Hello")
    }
}
class Valentine: Card()
{
    override fun greeting ()
    {
        println("Happy Valentines day")
    }
}
class Holiday: Card()
{
    override fun greeting()
    {
        println("Season's greetings")
    }
}
class Birthday: Card()
{
    override fun greeting ()
    {
        println("Happy birthday")
    }
}