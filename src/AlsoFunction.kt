

fun main() {

    /** Scope Function: 'also' 'also perform the following extra operation'
     * Property 1: refer to the context object by using 'it'
     * Property 2: the return value is the context object
     */

    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3)

    val duplicateNumbers = numbersList.also {
        println("the list elements are $it")
        it.add(4)
        println("the list elements after adding an element $it")
        it.remove(2)
        println("the list elements after removing an element $it")
    }

    println("Original numbers $numbersList")
    println("Duplicate numbers $duplicateNumbers")
}