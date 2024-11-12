/*
    Array dalam kotlin tidak seperti javascript yang isinya bisa campur
    Isinya akan selalu dengan tipe data yang sama

 */

/* INISIALISASI ARRAY UNCOMMENT TO RUN
    // INI CARA INISIALISASI
    // Namun untuk mengaksesnya tidak bisa langsung seperti println()
    // Hal tersebut akan membuat Error
fun main(){
    val names: Array<String> = arrayOf("Eko")
    val values: Array<Byte> = arrayOf(100,90,80)
    val balances:Array<Int> = arrayOf(10_000,20_000,50_000)

    println(names)
}
*/

/*
    Operasi Array
    size = untuk dapat panjang array
    get(index) = untuk mendapatkan posisi data di posisi index
    [index] = untuk mendapatkan data di posisi index
    set(index,value) = untuk mengubah data di posisi index
    [index] = value = untuk mengubah data di posisi index
*/

fun main() {
    val members: Array<String> =  arrayOf("Roni", "Ganish", "Pashya")
    val roni: String = members[0]
    val ganish: String = members.get(1)
    val pashya: String = members.get(2)

    // mengubah data di posisi index
    members.set(0, "Herta")
    val herta: String = members[0]
    println(herta)
    // sekalipun val tetapi masih bisa di ganti isinya, tetapi tidak bisa di ganti arraynya lagi
    // Contoh yang gak bisa
    // members = arrayOf("arrayBaru")
    // namun ngubah isi arraynya masih bisa

    //--------------NOTES--------------------
    // array juga tidak bisa null, misal names[0]=null

    //-------------NULLABLE ARRAY -----------------

    val members2: Array<String?> = arrayOfNulls(5)
    members2[0]="Roni"
    members2[1]="Roni"
    members2[2]="Roni"
    members2[3]= null
    members2[4]="Roni"
    // members2[5]="Roni" ini akan bikin error karena panjangnya hanya 5, ingat index start from 0
    println(members2.size)


}

