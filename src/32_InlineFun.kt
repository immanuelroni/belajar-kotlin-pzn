/*
    Inline Fun
    - HOF : HIGH ORDER FUNCTION
    - INF : INLINE FUNCTION
    - Menggunakan High Order Fun adalah fitur yang ammpuh
    - Namun hal ini makan resource, krn harus buat obj lambda berulang-ulang, jika terlalu banyak akan berasa
    - Inline fun adalah kemampuan Kotlin mengubah HOF menjadi Inline Fun
    - Dimana InF code dalam HOF akan diduplikat agar saat runtime tidak perlu buah terus
    - Mirip tail rekursive yang saat dicompile akan dirubah bentuk agar ringan
 */

inline fun helloInline(nama:()->String): String{
    return "using inline function: ${nama()}" // call the lambda
}


// no inline agar tidak inline. tapi ya apa fungsinya
inline fun helloMix(
    namaDepan: () -> String,
    noinline namaBelakang: () -> String // tidak kita inline, misal karena jarang dipanggil
): String {
    return "Hai ${namaDepan()} ${namaBelakang()}"
}

fun main() {
    println(helloInline { "Roni" })     // langsung isi data berupa String Lambda
    println(helloInline { "Immanuel" }) // langsung isi data berupa String Lambda

    for (i in 1..100){
        println(helloInline { "ini akan berat tanpa inline funtion" })
        println(helloMix({"Adi"},{"Susanto"}))
    }

    println(helloMix({"Adi"},{"Susanto"}))

    // namun ada alternative apabila kita ingin sebagian lambdanya tidak inline bisa kok


}

