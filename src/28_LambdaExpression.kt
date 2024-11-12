/*
    Fun bisa jalan bebas dimana saja, tanpa harus dalam class
    bisa dijalankan dengan lambda atau fun yang tanpa nama, mirip dengan di javascript
    jadi lambda seperti variable yang berjenis fungsi
 */
fun toUpper(data:String): String = data.uppercase()

fun main() {
    // LAMBDA DUA PARAMETER
    // membuat lambda
    // terlihat ribet tapi usefull

    // kalau fun biasa function biasanya: sayHello(nama:String ,pesan: String, saweran: String? ): Unit{}
    val contohLambda: (String, String) -> String = {
        firstName:String,
        lastName:String
        ->
        val result = "$firstName, $lastName"
        result // baris terakhir akan dianggap sebagai return, dalam lambda tidak ada kata kunci return, jadi pastikan hal ini tidak dipakai untuk codes yang paramnya kompleks
    }

    val result = contohLambda("A","B")
    println(result)

    // LAMBDA 1 PARAMETER
    // jika lambda hanya 1 parameter, kita bisa akses parameternya langsung dengan syntax it
    // hanya bisa jalan kalau parameter hanya ada 1
    val lambdaTest: (String) -> String = {
        it.uppercase()
    }
    println(lambdaTest("Roni"))

    //METHOD REFERENCE / REFERENSI FUCNTION
    // Membuat lambda dari sebua fun yang sudah kita buat
    val lambdaCustomUppercase: (String)-> String = ::toUpper
    println(lambdaCustomUppercase("Test fun reff"))

}