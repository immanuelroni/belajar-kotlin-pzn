//Variable Constant
//Akan selalu const val bukan const var
const val APP = "Belajar Kotlin"

fun main(){

    /*
    Dalam Kotlin ada dua jenis variable
    Petama itu Mutable yang artinya bisa diubah nilainya. di tulis dengan var
    Kedua itu Immutable yang artinya tidak bisa diubah nilainya, seperti Const dalam Java. di tulis dengan val

    PENULISANNYA
    va;/var NamaVariable: TipeData = data


    TIPS
    1. Sebaiknya gunakan immutable, karena lebih aman krn tidak bisa diubah.
    */

    var namaDepan: String = "Immanuel"

    //sekalipun di tulis demikian kotlin juga paham.
    val namaBelakang = "Roni"

    //contoh lain, ini akan jadi Integer secara default
    val age = 20
    val ukuran = 12L

    // ini akan error karena "Roni" adalah val yaitu variable yang immutable
    // namaBelakang = "Roni Handoko"

    // NULLABLE
    // Secara default data tidak bisa di set null saat awal deklarasi
    // var namaHewan:String = Null ini akan error
    // Secara standart harusnya dideklarasikan nilainya.


    // Namun sebenernya masih bisa null tetapi tidak direkomendasikan
    //NULL
    //Caranya seperti ini, namun tidak direkomendasikan
    // ini variable artinya bisa null, jadi ada tanda ? setelah tipe data
     var firstName:String? = null
    // ini artinya var tersebut bisa null,
    // Akan error jika
    // println(firstName.length)
    // ini akan works
    println(firstName?.length)

    //VARIABLE CONSTANT
    // mirip val, namun untuk global variable
    // biasanya namaVariablenya UPPER_CASE
    println(APP)
}