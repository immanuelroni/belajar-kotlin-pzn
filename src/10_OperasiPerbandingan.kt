/*
   OPERASI PERBANDINGAN
   Membandingkan dunai nilai yang hasil akhirnya adalah Boolean, benar atau salah
   >
   <
   >=
   <=
   ==
   !=
 */

fun main(){
    val a = 100
    val b = 200
    val result: Boolean = a>b
    println("Result " +result) // hasilnya akan false

    println(100>=100)
    println(100<=100)
    println("a"<"b") // karena lebih dulu a
    println("a"=="a")
    println("a"!="a")
}