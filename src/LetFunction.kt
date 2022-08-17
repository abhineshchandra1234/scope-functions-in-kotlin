
fun main() {

    /** Scope Function: 'let'
     * Property 1: Refer to the context object by using it
     * Property 2: The return value is the 'lambda result'
     * Use 'let' function to avoid NullPointerException
     */

    val name: String? = "Hello"

    //before using let
    println(name?.reversed())
    println(name?.capitalize())

    //after using let
    val stringLength = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length
    }

    println(stringLength)
}