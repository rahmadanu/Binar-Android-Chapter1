package function

fun main() {

    val oddOrEven = { number: Int -> if (number % 2 == 0) "Even" else "Odd" } //Lambda expression
    println(oddOrEven(45))

    println(isEvenOrOdd(32, ::getInput))
}

fun isEvenOrOdd(num: Int, input: (Int) -> String): String {
    return input(num)
}

fun getInput(num: Int): String {
    return if (num % 2 == 0) "Even" else "Odd"
}

