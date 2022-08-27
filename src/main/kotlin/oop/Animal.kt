package oop

open class Animal {

    open fun walk(): Unit {

    }
}

class Dog : Animal() {

    override fun walk() {
        println("blabla")
    }
}

fun main() {
    val dog = Dog()
    dog.walk()
}