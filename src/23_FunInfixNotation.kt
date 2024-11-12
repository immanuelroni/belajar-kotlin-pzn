/*
    intinya semua operasi matematika antara dua data disebut dengan infix notation
    hampir semua operasi math adalah infix notation
    hanya ada di kotlin

    deklarasinya infix fun Tipedata.namaInfix():{}


    hal ini jarang dipakai

    Namuna ada syaratnya
    1. Harus sebagai function member atau funtion extention
    2. harus memiliki 1 parameter saja
    3. parameter tidak boleh varargs dan tidak boleh memiliki nilai default
 */
infix fun String.ubahKe(type: String):String{
    if(type=="Up"){             // gunakan parameternya untuk mengakses data kanan
        return this.uppercase() // gunakan this untuk mengakses data kiri
    }else{
        return this.lowercase()
    }
}

fun main() {
 val hasil = "Roni" ubahKe "Up"
    println(hasil)

    1 downTo 100 // salah satu contoh infix notation
}