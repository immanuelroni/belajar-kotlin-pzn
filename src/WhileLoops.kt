/*
    PERULANGAN SAMPAI DENGAN KONDISI TERPENUHI
 */

fun main() {
    var i = 0
    while (i<10){
    //println("$i")
        i++
    }

    // DALAM ARRAY
    val listClient: Array<String> = arrayOf("Oxva","Caliburn","Rova")
    var x = 0
    while (x<listClient.size){
        println("${listClient.get(x)}")
        x++
    }
}