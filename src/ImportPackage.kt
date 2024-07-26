/*
    Cara untuk manage data source code kita

    PACKAGE
    - folder untuk menyimpan source code kita
    - penamaan package lowercase semua
    - cara buat sub package dengan tanda titik .
 */

import com.realarstudio.belajar.util.sayBye
import com.realarstudio.belajar.util.sayHi
// ini cara import semua dari util
// import com.realarstudio.belajar.util.*

fun main() {
    // cara pakai import dulu
    sayHi("Hi apa kabar kamu hari ini?")
    //atau bisa juga tanpa import dulu
    com.realarstudio.belajar.util.sayBye("")
    sayBye("")

}