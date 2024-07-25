/*
    Boolean
    && artinya Dan
    || artinya Atau
    !  artinya tidak atau negasi
 */

fun main(){
    val NilaiAkhir = 80
    val kehadiran = 75

    val LolosNilaiAkhir = NilaiAkhir > 75
    val LolosKehadiran = kehadiran > 80

    val pass = LolosNilaiAkhir && LolosKehadiran
    println(pass)

}