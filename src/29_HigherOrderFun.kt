/*
    Higher Order Fun adalah fun yang menggunakan fun sebagai parameternya
    berguna ketika ingin membuat fun general, dan ingin dapat data flexible berupa lambda, yang bisa
    didklarasikan oleh si user ketika memanggil fun tersebut

    namun lambda tidak cocok digunakn untuk fun yang kompleks, karena lambda tidak memilki syntax return.
    Sebab baris paling akhir dari lambda dianggap sebagai return
 */

//int
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

//teks
fun cetakPesanLambdaExpression(value:String, transformerText: (String)->String):String {
    return "Teks ini di transform ${transformerText(value)}"
}

fun main() {
    //-------------------  CONTOH DASAR  -------------
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // membuat lambdanya
    val lambdaUpper: (String)-> String = {value:String -> value.uppercase()}
    // bisa juga ditulis lambdaUpper = {value:String -> value.uppercase()} karena kotlin bisa ditulis atau tidak.

    println(hello("Roni test lambda",lambdaUpper))
    println(hello("Roni test lambda",{value:String -> value.uppercase()})) // Cara yang biasa digunakan.
    /*
        bisa juga langsung println(hello("Roni test lambda",{value:String -> value.uppercase()}))
        jadi lambdanya langsung dideklarasikan dalam parameter functionnya.

     --------------------- CONTOH DASAR ------------------------
    */


    // -------------- TRAILING LAMBDA --------------------------
    // pemanggilan lambda juga bisa setelah tanda (), jika lambda expression yang di acu berada di paling akhir parameter FUNCTION
    // contohnya di cetakPesanLambdaExpression parameter paling kanan adalah lambda, maka bisa di akses
    // ini disebut TRAILING LAMBDA

    val trailingLambda = hello("TRAILING lAMBDA"){
        value:String ->
        value.lowercase()
    }
    println(trailingLambda)
    // -------------- TRAILING LAMBDA --------------------------

    // -------------- COBA SENDIRI --------------------------

    val sum = operation(5, 3, { a:Int, b:Int -> a + b })
    println(sum) // Output: 8

    val multiply = operation(5, 3){ a, b -> a * b }
    println(multiply) // Output: 15

    //perintah lambdanya
    val upperTransformer = {x:String -> x.uppercase()}

    // bisa dengan gaya seperti ini
    val lowercaseTransformer = {y:String -> y.lowercase()}

    println(cetakPesanLambdaExpression("Teks1",upperTransformer))
    println(cetakPesanLambdaExpression("Teks2",lowercaseTransformer))


    // lambda expression ternyata juga bisa ditulis dibelakang fun / trailing lambda
    println(cetakPesanLambdaExpression("Teks2"){it.uppercase()})
}