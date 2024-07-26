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
    val sum = operation(5, 3, { a:Int, b:Int -> a + b })
    println(sum) // Output: 8

    //pemanggilan lambda juga bisa setelah tanda (), jika lambda expression yang di acu berada di paling akhir parameternya
    // contohnya di cetakPesanLambdaExpression parameter paling kanan adalah lambda, maka bisa di akses
    // ini disebut trailing lambda
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