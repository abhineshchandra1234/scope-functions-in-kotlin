class applyFunction {
    var name: String = ""
    var age: Int = 0
}

fun main() {
    /** Scope function 'apply'
     * Property 1: Refer to the context object by using 'this'
     * Propery 2: The return value is the 'context object'
     */

    val applyFunction = applyFunction().apply {
        this.name = "abhinesh"
        age = 25
    }

    with(applyFunction) {
        name = "chandra"
        println(name)
        println(age)
    }
}