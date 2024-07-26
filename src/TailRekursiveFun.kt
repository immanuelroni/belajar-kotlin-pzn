/*
    Terjadi ini karena keterbatasan dari rekursive function yang umum bisa menyebabkan stackOverflow
    dibuatlah tail rekursive function ini
    ini cara akal-akalan kotlin aja sebenernya

    Syaratnya
    1. didepan fun harus ada syntax tailrec
    2. hanya boleh memanggih fun rekursivenya sendiri tersebut
 */

fun main() {
    // ini bakal kena overflow
    fun display(value:Int){
        println("Rekursive $value")
        if(value > 0){
            display(value-1) // line ini tidak bisa di tambak operasi lain. misal +2 atau apapun
        }
    }

    // ini akan jalan normal
    tailrec fun displayTailRec(value:Int){
        println("Rekursive $value")
        if(value > 0){
            displayTailRec(value-1)
        }
    }

    displayTailRec(10000)

    // ini cara panggil tailrec yang salah karena ada operasi perkalian sebelumnya
    tailrec fun factorial(n: Long): Long {
        return when (n) {
            0L, 1L -> 1L
            else -> n * factorial(n - 1)
        }
    }
    // cara ngakalinya adalah dengan cara operasinya diubah, agar pemanggilannya sesuai aturan
    tailrec fun factorialtype2(n: Long, total:Long = 1L): Long {
        return when (n) {
            0L, 1L -> total
            else -> factorialtype2(n - 1, total * n)
        }
    }

    println(factorial(100))
}