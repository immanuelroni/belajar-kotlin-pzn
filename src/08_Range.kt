 /*
    Kadang kita butuh data yang isinya berurutan misal  1 sampai dengan 100
    kalau pakai Array tentu akan ribet
    Caranya pakai tanda titi dua kali ..
    misal 0..10 atau 0..100
 */

fun main(){
    val range = 1..100
    println(range)
    //namun kita tidak bisa mengakses datanya misal .get atau .size
    // fungsinya untuk perulangan nantinya


/*
    OPERASI RANGE
    count() =mendapatkan total data di range
    contains(value) = mengecek apakah terdapat value tersebut
    first = mendapatkan nilai pertama
    last = mendapatkan nilai terakhir
    step = mendapatkan nilai tiap kenaikan
 */
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
/*
    Range Terbalik
*/
    println("------ downTo-------")
    val range2 = 1000 downTo 1
    println("/n Range DownTo")
    println(range2.count())
    println(range2.contains(50))
    println(range2.contains(200))
    println(range2.first)
    println(range2.last)
    println(range2.step)
    println("--------------------")

/*
    Namun bisa juga
 */
    val range3 =0..100 step 5
    val range4 =1000 downTo 1 step 5
    println("/n Range DownTo manual")
    println(range4.count())
    println(range4.contains(50))
    println(range4.contains(200))
    println(range4.first)
    println(range4.last)
    println(range4.step)
}