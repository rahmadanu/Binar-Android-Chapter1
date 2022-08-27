package challenge

abstract class Shape {

    abstract fun createShape(size: Int)
}

class Pyramid : Shape() {

    override fun createShape(size: Int) {
        println("1. Piramida")

        for (row in 1..size) {

            for (space in 1..size - row) print(" ")
            for (star in 1 until row * 2) print("*")

            println()
        }

        println()
    }
}

class InvertedPyramid : Shape(){

    override fun createShape(size: Int) {
        println("2. Piramida terbalik")

        for (row in 1..size) {

            for (space in 2..row) print(" ")
            for (star in row .. size * 2 - row) print("*")

            println()
        }

        println()
    }
}

class Diamond : Shape() {

    override fun createShape(size: Int) {
        println("3. Diamond")

        for (rowTop in 1..size / 2 + 1) {

            for (spaceTop in 1 .. size / 2 + 1 - rowTop) print(" ")
            for (star in 1 until rowTop * 2) print("*")

            println()
        }

        for (rowBottom in 1..size / 2) {

            for (spaceBottom in 1..rowBottom) print(" ")
            for (star in rowBottom until size - rowBottom) print("*")

            println()
        }

        if (size % 2 == 0) println("Masukkan ukuran dengan angka ganjil untuk hasil terbaik!")
        println()
    }
}

class X : Shape() {

    override fun createShape(size: Int) {
        println("4. X")

        for (row in 1..size) {

            for (col in 1..size) {

                if (col == row || col == size + 1 - row) {
                    print("*")
                } else {
                    print(" ")
                }
            }

            println()
        }

        if (size % 2 == 0) println("Masukkan ukuran dengan angka ganjil untuk hasil terbaik!")
        println()
    }

}

class RightTriangle : Shape() {

    override fun createShape(size: Int) {
        println("5. Segitiga siku-siku")

        for (i in 1..size) {

            for (j in 1..i) print("*")

            println()
        }

        println()
    }
}

fun main() {
    print("Masukkan ukuran: ")
    val size = readLine()!!.toInt()

    Pyramid().createShape(size)
    InvertedPyramid().createShape(size)
    Diamond().createShape(size)
    X().createShape(size)
    RightTriangle().createShape(size)
}

// Rahma Danu Sadewa