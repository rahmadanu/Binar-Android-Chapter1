package solid

interface Vehicle {
    fun drive() = "Mengendarai"
    fun stop() = "Berhenti"
    fun refuel() = "Isi ulang bensin"
}

interface VehicleWithDoor {
    fun openDoors() = "Buka pintu"
}

class Motorcycle : Vehicle

class Car : Vehicle, VehicleWithDoor

fun main() {
    val car = Car()
    println("Mobil ${car.openDoors()}")

    val motor = Motorcycle()
    println("Motor ${motor.refuel()}")
}