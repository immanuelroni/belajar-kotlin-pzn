fun main(){
    //Tipe data string menggunakan "" untuk teks satu baris
    // kalau tiga kali """ bisa lebih dari satu baris

    //Contohnya seperti ini

    var namaDepan: String = "Immanuel"
    var namaBelakang: String = "Roni"

    //GABUNG STRING CARA KUNO
    // cara gabung string "cara lama"
    var namaLengkap: String = "Immanuel"+" "+"Roni"

    //GABUNG STRING CARA TERBAIK
    var namaLengkap2: String = "$namaDepan $namaBelakang"
    var desc: String = "total $namaLengkap2 char = ${namaLengkap2.length}"
    println(desc)


    //STRING DENGAN BEBERAPA BARIS
   /* var alamat: String = """ Bakulan kulon,
        patalan, 
        jetis, 
        bantul, """

        Tetapi ini bakal ada ruang sisa kalau seperti ini, coba aja prinptln()
    */


    var alamat2: String = """
        |Bakulan kulon,
        |Patalan,
        |Jetis,
        |Bantul,
        |""".trimMargin(marginPrefix = "|")
//    println(namaLengkap)
    //println(alamat2)
    //println(alamat)
}