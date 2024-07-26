/*
    Inline Fun
    - Menggunakan High Order Fun adalah fitur yang ammpuh
    - Namun hal ini makan resource, krn harus buat obj lambda berulang-ulang, jika terlalu banyak akan berasa
    - Inline fun adalah kemampuan Kotlin mengubah HOF menjadi Inline Fun
    - Dimana InF code dalam HOF akan diduplikat agar saat runtime tidak perlu buah terus
    - Mirip tail rekursive yang saat dicompile akan dirubah bentuk agar ringan
 */

inline fun helloInline(nama:()->String): String{
    return "Hai Inline Fun ${nama()}" // call the lambda
}


// no inline agar tidak inline. tapi ya apa fungsinya
inline fun helloMix(
    noinline namaDepan: () -> String,
    noinline namaBelakang: () -> String): String {
    return "Hai ${namaDepan} ${namaBelakang}"

}

fun main() {
    println(helloInline { "Roni" })
    println(helloInline { "Immanuel" })

    for (i in 1..100){
        println(helloInline { "ini akan berat" })
    }

    println(helloMix({"Adi"},{"Susanto"}))

    // namun ada alternative apabila kita ingin sebagian lambdanya tidak inline bisa kok


}

