/*
    Rung lingkup sebuah funtion dapat di akses
    di Java funtion harus ada di dalam class, tidak bisa sembarangan
    di Kotlin bisa bebas dinama saja.
    Namun kita bisa juga membuat fun di dalam fun agar hanya bisa di akses di fun tertentu saja.
 */

fun call(){
    //Hi()// ini akan error krn yang bisa panggil dalam fungsi main saja.
}


fun main() {

    // hanya bisa di akses di dalam fun main() saja
    fun Hi(nama:String):Unit{
        println("Hi $nama")
    }
    Hi("Roni")
}