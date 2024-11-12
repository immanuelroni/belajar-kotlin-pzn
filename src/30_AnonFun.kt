/*
    Lambda akan menganggap baris terkahir di blok lamda sebagai hasil kembalian
    Kadang kita butuh lamnbda yang fleksibel fun, dimana kita bisa mengembalikan hasil dimanapun, tidak
    harus di paling belakang.
    Untuk itu kita pakai anonymouse fun
    Anon Fun sebenernya mirip dengan Lambda, hanya saja cara mebuatnya yang berbeda
 */

fun main() {

    fun cetakPesan(value:String, transformerText: (String)->String):String {
        return "Teks ini ditransform jadi ${transformerText(value)}"
    }
    //-------------- SYNTAX --------------
    // val namaVar = fun(a:TipeData): TipeDataReturn {}
    val anonUpper = fun(x:String): String {
        if(x.isBlank()){
            return "Kosong!"
        }else{
            return x.uppercase()
        }
    }
    // jadi anon function kini bisa di akses seperti lambda
    println(cetakPesan("Roni",anonUpper))
    println(cetakPesan("",anonUpper))

    //anonymouse function juga bisa seperti ini
    println(cetakPesan("",fun(x:String):String{
        return x.lowercase()
    }))

}