/*
    1.Kadang dalam sebuah function kita butuh menggunakan if else expression atau when, lalu di dalam blok kita mengembalikan nilai untuk function tsb.
    2. Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita, ketika ingin mengembalikan nilai dalam if atau when.
*/

fun main() {
    fun sayHello(nama: String =""): String{
        return if (nama==""){
            "Hello Bro"
            // jadi bukan if (nama==""){ return "Hello bro"}
            // biar gak banyak pakai return
        }else{
            "Hello $nama"
        }
    }

    fun cetakPesan(nama: String =""): String{
       return when (nama) {
           /*   ---- sebelumnnya ---------
                when(nama){
                ""-> return "Hello Bro"
                else-> return "Hello $nama"
                }
            */
           ""->  "Hello Bro"
           else ->  "Hello $nama"
       }
    }

    println(sayHello())
    println(sayHello("Roni"))
    println("\n")
    println(cetakPesan())

}

