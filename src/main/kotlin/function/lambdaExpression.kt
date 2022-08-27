package function

fun main() {
    val sum = {a: Int, b: Double -> a + b}
    println(sum(1, 1.5))

    val sum2: (Int, Double) -> Double = {a, b -> a + b}
    println(sum2(1, 1.5))
}