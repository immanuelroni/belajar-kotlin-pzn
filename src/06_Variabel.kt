//Variable Constant
//Akan selalu const val bukan const var
const val APP = "Belajar Kotlin"
const val VERSION = "12.0.0"
fun main(){

    /*
    Dalam Kotlin ada dua jenis variable
    Petama itu Mutable yang artinya bisa diubah nilainya. di tulis dengan var
    Kedua itu Immutable yang artinya tidak bisa diubah nilainya, seperti Const dalam Java. di tulis dengan val

    PENULISANNYA
    val/var NamaVariable: TipeData = data

    TIPS
    1. Sebaiknya gunakan immutable, karena lebih aman krn tidak bisa diubah.
    */

    var namaDepan: String = "Immanuel"

    // DEKLARASI
    //sekalipun di tulis demikian kotlin juga paham, tanpa perlu declare String
    val namaBelakang = "Roni"

    //contoh lain, ini akan jadi Integer secara default
    val age = 20
    val ukuran = 12L // Ini akan jadi Long

    // ini akan error karena "Roni" adalah val yaitu variable yang immutable
    // namaBelakang = "Roni Handoko"

    //--------------------NULLABLE---------------------------------------
    // NULLABLE
    // Secara default data tidak bisa di set null saat awal deklarasi
    // var namaHewan:String = Null ini akan error
    // Secara standart harusnya dideklarasikan nilainya.

    //-------------------- TIDAK DI REKOMENDASIKAN-----------------------
    // Namun sebenernya masih bisa null tetapi tidak direkomendasikan
    //NULLABLE
    //Caranya seperti ini, namun tidak direkomendasikan
    // ini variable artinya bisa null, jadi ada tanda ? setelah tipe data
     var firstName:String? = null
    // ini artinya var tersebut bisa null,
    // Akan error jika
    // println(firstName.length)
    // ini akan works, Karena akses pakai ?
    println(firstName?.length)

    //--------------------VARIABLE CONSTANT------------------------------
    // mirip val, namun untuk global variable
    // biasanya namaVariablenya UPPER_CASE
    println("$APP:$VERSION")
}