/*
    - Label adalah penanda
    - Semua expression dalam kotlin bisa ditandai dengan label
    - Untuk membuat label, cukup menggunakan namaLabel@
    - Bisa di integrasikan dengan break, continue dan return
    - Jarang dipakai, karena bakal jumping2 antar code, tapi tidak direkomendasikan
    - Gunakan saat terdesak saja
 */
fun testLabel(nama:String, param:(String) -> Unit): Unit = param(nama)

fun main() {
    loopI@ for(i in 1..10){
        loopJ@ for (j in 1..10){
            /*
                if(i>5){
                break@loopI
            }
            */
            //----------------------------------
            /*
                if(j==5){// pas j adalah 5 dia akan lanjutkan i, jadi akan mulai lanjut di 2*1 tanpa ada 1*5
                continue@loopI
                }
             */


            println("$i*$j = ${i*j}")

            testLabel("Roni")testX@{
                if(it==""){
                    return@testX
                }else{
                    println("Eko")
                }
            }

        }
    }
}