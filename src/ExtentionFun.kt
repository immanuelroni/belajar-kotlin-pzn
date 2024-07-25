/*
    Extention Function adalah kemampuan untuk menambahkan fun pada tipe data yang sudah ada
    Extention Function adalah salah satu fitur yang sangat ampuh, harus bijak saat memakai, sebab sulit dimengerti
    programmer lain saat documentation, seperti magic
 */


// dengan demikian setiap tipe data string jadi punya function yaitu hello
fun String.hello():String{
    return "Hello $this"
}
//mixing extention func dan single expression fun
fun String.Hi(): Unit = println("Hi $this")

fun main() {
    val name: String = "Roni"
    println(name.hello())

    //bahkan bisa seperti ini
    "Ganish".Hi()

}