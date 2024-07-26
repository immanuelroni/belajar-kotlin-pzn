/*
    Closures
    - Adalah kemampuan sebuah fun, lambda atau anon fun untuk berinteraksi dengan data di sekitarnya.
    - Mirip dengan acess modifier di Java sepertinya
    - Harap hindari penggunaan Closure karena dapat berbahaya jika salah penggunaan, bisa akses data dari luar haknya
 */

fun main() {
    var counter: Int = 0 // var ini bisa di akses fun, lambda dan fun anon dari dalamnya dan ini bahaya

    //lambda akses counter
    val lambdaIncrement: () -> Unit ={
        println("Naik $counter")
        counter++
    }

    val anonIncrement = fun(){
        println("AnonIncrement")
        counter++
    }

    fun incrementClosure(){
        println("Fun umum increment")
        counter++
    }
    lambdaIncrement()
    anonIncrement()
    incrementClosure()
}