package solid

abstract class Engine {
    abstract fun start()
}

class Hybrid : Engine() {
    override fun start() {
        println("Mesin hybrid dimulai")
    }

}

class Diesel : Engine() {
    override fun start() {
        println("Mesin diesel dimulai")
    }

}

class Car2(private val engine: Engine) : Engine() {

    override fun start() {
        engine.start()
    }
}

fun main() {
    val car: Engine = Car2(Hybrid())
    car.start()
}

