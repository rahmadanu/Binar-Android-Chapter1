package function

fun main() {
    val message = "hello world"
    println(message.capitalize())
    println(message.toTitleCase())

    val value = 5
    println(value.addFive())
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") {
        it.capitalize()
    }
}

fun Int.addFive(): Int {
    return this + 5
}