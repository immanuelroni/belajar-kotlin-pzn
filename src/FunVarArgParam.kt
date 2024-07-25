/*
    VarArg kita bisa buat parameter sebagai seperti array
    penempatan harus ada di paling kanan
 */

// ini cara ribet via array
fun hitungTotalArray(values: Array<Int>):Int {
    var total: Int = 0
    for (value in values){
        total += value
    }
    return total
}

// ini cara Var Args
// pastikan parameternya harus di paling kanan
fun hitungTotalVararg(vararg values: Int):Int {
    var total: Int = 0
    for (value in values){
        total += value
    }
    return total
}

fun main() {
    val values = arrayOf(10,10,10,10)
    val hasil = hitungTotalArray(values)
    println(hasil)

    // call cara varargs, jadi lebih mudah kan
    val hasil2 =  hitungTotalVararg(10,10,10,10,10,10,10,10,10)
    println(hasil2)
}