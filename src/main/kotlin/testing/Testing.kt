package testing

import kotlin.math.abs

class Testing {
}

fun main() {

    val size = 5

    for (i in 1..size) {

        for (j in 1..size * 2) {

            if (i == j || j == size + 1 - i) {
                print("*")
            } else {
                print(" ")
            }
        }

        println()
    }
}