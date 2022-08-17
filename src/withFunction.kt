class Person {
    var name: String = "Abhinesh Chandra"
    var age: Int = 25
}

fun main() {
    /** Scope function 'with'
     * Property 1: Refer to the context object by using 'this'
     * Propery 2: The return value is the 'lambda result'
     */

    val person = Person()
    println(person.name)
    println(person.age)

    val ageAfterFiveYears: Int = with(person) {
        println(this.name)
        println(age)
        age + 5
    }

    println("Age after 5 years is $ageAfterFiveYears")
}