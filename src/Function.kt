/*
        fun NamaFungsi(){
        }

        Bisa juga pakai parameter
 */

fun HaloDunia(){
    println("Halo cuk")
}

//function dengan parameter, saweran bisa null
fun sayHello(nama:String ,pesan: String, saweran: String? ){
    if(saweran==null){
        println("$nama Hallo, $pesan")
    }else{
        println("$nama Hallo, $pesan,  $saweran")
    }

}

fun sawerYuk(nama: String, pesanSaweran: String = ""){
    println("Function Default parameter ")
    println("Nama: $nama, Pesan:$pesanSaweran")
}

    /*
    Named argument
    kita bisa menyebutkan nama parameter saat memanggil funcion, tanpa kita tahu posisi parameter,
    depan belakangnya.

    jadi panggilnya acak
    */
fun nyawerNameParam(nama: String,
               pesanSaweran: String,
               jumlahSaweran: Int?){
    println("")
    println("$nama, Pesan: $pesanSaweran, $jumlahSaweran")
}
fun main() {
    HaloDunia()
    sayHello("Roni","Apa kabar?", null)
    sayHello("Roni","Apa kabar?", "1000")

    //function default parameter
    sawerYuk("Roni", "Ahai sawer! Gas")
    sawerYuk("Roni")

    //named argument function, jadi kita tembak value function saat call tanpa tahu urutannya
    // namun semua named argument harus semua, gak bisa salah satu aja yang named argument
    nyawerNameParam(
        nama="Roni",
        jumlahSaweran = 10, // ini urutanya harusnya di akhir tapi bisa di call baris 2
        pesanSaweran = "Joget Boi!"
    )
}