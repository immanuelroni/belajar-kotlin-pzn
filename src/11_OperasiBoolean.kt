/*
    Boolean
    && artinya Dan
    || artinya Atau
    !  artinya tidak atau negasi
 */

fun main(){
    val NilaiAkhir = 80
    val kehadiran = 75

    val lolosNilaiAkhir = NilaiAkhir > 70
    val lolosKehadiran = kehadiran > 60

    val pass = lolosNilaiAkhir && lolosKehadiran
    println(pass)

}