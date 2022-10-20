import org.jetbrains.annotations.Nullable

fun main(args: Array<String>) {
    val email = "user@mydomain.com"

var array2 = email.toString().map { it.toString() }.toTypedArray()
var c:Char?=null

    while (c=='@')
    {
        println(c)

    }


val username = email.substringBefore('@')
val domain = email.substringAfter('@')
val extension = domain.substringAfterLast('.')
println("\nUser name = $username")
println("Domain = $domain")
println("Extension = $extension")

}