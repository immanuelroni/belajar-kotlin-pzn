/*
    FOR LOOPS, PERULANGAN
    ARRAY, RANGE, LAIN-LAIN
 */

fun main() {
    val names = arrayOf("Roni","Ganish","Pashya")
    var jumlahData = 0
    for (name in names){
        println(name)
        jumlahData++
    }
    println("Total jumlah data= $jumlahData")

    //FOR UNTUK RANGE
    for(value in 0..10){
        println(value)
    }

    for (value in 1000 downTo 1 step 100){
        println(value)
    }

    // kombinasi yang biasa digunakan
    val  ukuranArray = names.size-1
    for (i in 0..ukuranArray){
        println("Index $i = ${names.get(i)}")
    }

}
