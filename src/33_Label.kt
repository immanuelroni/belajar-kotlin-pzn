/*
    - Label adalah penanda
    - Semua expression dalam kotlin bisa ditandai dengan label
    - Untuk membuat label, cukup menggunakan namaLabel@
    - Bisa di integrasikan dengan break, continue dan return
    - Jarang dipakai, karena bakal jumping2 antar code, tapi tidak direkomendasikan
    - Gunakan saat terdesak saja
 */


fun main() {
    fun loopSatu() {
        loopI@ for (i in 1..10) {
            loopJ@ for (j in 1..10) {
                if (i > 5) {
                    break@loopI
                }
                println("$i*$j = ${i * j}")
            }
        }
    }

//    loopSatu()

    fun loopDua() {
        loopI@ for (i in 1..10) {
            loopJ@ for (j in 1..10) {
                if (j == 5) {// pas j adalah 5 dia akan lanjutkan i, jadi akan mulai lanjut di 2*1 tanpa ada 1*5
                    continue@loopI
                }
                println("$i*$j = ${i * j}")
            }
        }
    }

//    loopDua()

    //---------------- bikin lambda yang bisa return
    fun testLabel(nama:String, param:(String) -> Unit): Unit { // bisa juga ditulis langsung fun testLabel(nama:String, param:(String) -> Unit): Unit = param(nama)
        param(nama)
    }

    fun loopTiga(){
        testLabel("")testX@{
            if(it==""){
                return@testX
            }else{
                println("Eko")
            }
        }
    }

    loopTiga()

}
