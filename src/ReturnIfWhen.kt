fun main() {
    fun sayHello(nama: String =""): String{
        return if (nama==""){
            "Hello Bro"
        }else{
            "Hello $nama"
        }
    }

    fun cetakPesan(nama: String =""): String{
       return when (nama) {
           ""->  "Hello Bro"
           else ->  "Hello $nama"
       }
    }

    println(sayHello())
    println(sayHello("Roni"))
    println("\n")
    println(cetakPesan())

}

