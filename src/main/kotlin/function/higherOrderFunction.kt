package function

fun printMe(s: String, num: Int) {
    println("$s $num")
}

fun higherFunc(str: String, num: Int, myFun: (String, Int) -> Unit) {
    myFun(str, num)
}

fun addition(num: Int): Int {
    return num + 5
}

fun higherFun2(num: Int): (Int) -> Int {
    return ::addition
}

fun main() {

    higherFunc("Hello world", 2, ::printMe)
    /*val result = higherFun2()
    println(result)*/
}