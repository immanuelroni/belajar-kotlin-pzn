/*
    Lambda akan menganggap baris terkahir di blok lamda sebagai hasil kembalian
    Kadang kita butuh lamnbda yang fleksibel fun, dimana kita bisa mengembalikan hasil dimanapun, tidak
    harus di paling belakang.
    Untuk itu kita pakai anonymouse fun
    Anon Fun sebenernya mirip dengan Lambda, hanya saja cara mebuatnya yang berbeda
 */

fun main() {

    fun cetakPesanLambdaExpression(value:String, transformerText: (String)->String):String {
        return "Teks ini ditransform jadi ${transformerText(value)}"
    }

    val anonUpper = fun(x:String): String {
        if(x.isBlank()){
            return "Kosong!"
        }else{
            return x.uppercase()
        }
    }

    println(cetakPesanLambdaExpression("Roni",anonUpper))
    println(cetakPesanLambdaExpression("",anonUpper))

    //bisa juga seperti ini
    println(cetakPesanLambdaExpression("",fun(x:String):String{
        return x.lowercase()
    }))

}