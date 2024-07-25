/*
    Break and Continue
    Break untuk stop perulangan gunakan break, jadi dia akan keluar dari perulangan
    Continue untuk stop perulangan saat itu, lalu lanjut ke perulangan selanjutnya
 */

fun main() {
    var i = 0
//    while (true){
//        println("Break me")
//        i++
//        if(i>100){
//            break
//        }
//    }

    for (i in 1..100){
        if(i%2==0){
            continue // keluar loop lanjut ke loop selanjutnya
        }
        println("$i") // bakal cetak semua bilangan ganjil
    }
}