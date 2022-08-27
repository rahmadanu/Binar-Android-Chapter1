package `class`

class Human ( // Primary Constructor
    val name: String,
    val age: Int,
    _school: String, //declaration without val/var
    _location: String = "Earth" //Default value
        ){
/* Properties
    var name: String = "Danu"
    var age: Int = 20
*/
var school = _school
    var location = _location

    init {
        println("This is init")
    }


    // Method (also called property)
    fun isDoing(activity: String): String {
        return """
            $name is $activity
            he is studying in $school
            he is from $location
            """.trimIndent()
    }
}

class Student(val name: String) {
    var age: Int = 30
    var name1: String = name
    constructor(_age: Int, _name: String): this(_name) {
        age = _age
    }
}

fun Human.print() {
    println(this.name)
}

fun main() {
    val danu = Human("Danu", 20, "Binar", "Mars")
    println(danu.isDoing("reading"))
    println("${danu.name} is ${danu.age} years old")

    danu.print()
}