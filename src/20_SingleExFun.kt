/*
    Single Expression Function
    adalah funsi yang sederhana dan bisa ditulis dalam 1 line of code
*/
// ini akan return nilai a*a secara langsung
fun Power(a:Int):Int = a*a

fun sapa(sapaan: String): Unit = println("sapa: $sapaan")

// contoh lain dengan String
fun pertanyaan(kalimat: String): Unit = println("$kalimat")
fun main() {
    println(Power(2))
    sapa("Apa kabar")
}