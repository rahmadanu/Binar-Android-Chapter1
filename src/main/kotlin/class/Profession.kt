package `class`

class Profession (private var name: String, var profession: String) {

    var age: Int = 0

    constructor(_name: String, _profession: String, _age: Int) : this(_name, _profession) {
        age = _age
    }

    fun speak(): String {
        return "$name can speak Mandarin"
    }

    fun walk(): String {
        return "$name is walking to the Binar school"
    }

    fun eat(): String {
        return "$name is eating bananas"
    }
}

fun main() {
    val teacher = Profession("Danu", "Math teacher")
    val businessman = Profession("Dimas","Businessman")
    val athlete = Profession("Ilham", "Athlete", 20)

    println(teacher.walk() + " and being a ${teacher.profession}")
    println(businessman.speak() + " and he is a successful ${businessman.profession}")
    println(athlete.eat() + " before running a 5km marathon and he is ${athlete.age} years old")

    fun sleep() {
        println(" I'm sleeping")
    }

    sleep()
}

//Rahma Danu Sadewa