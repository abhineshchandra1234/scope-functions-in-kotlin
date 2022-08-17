
class RunFunction {
    var name: String = "Abhinesh Chandra"
    var age: Int = 25
}

fun main() {
    /** Scope function: 'run'
     * Property 1: Refer to the context object using 'this'
     * Property 2: The return value is the 'lambda result'
     * 'run' is the combination of with and let
     * if you want to operate on a nullable object and avoid NullPointerException use 'run'
     */

    val person: RunFunction? = RunFunction()

    val bio = person?.run {
        println(this.name)
        println(age)
        "he is an android developer"
    }

    println(bio)
}