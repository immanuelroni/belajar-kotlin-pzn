/*
    Ada fun yang mengembalikan data dan ada yang tidak
    Fun yang membalikan data selalu mengembalikan
 */

// Unit artinya fun ini tidak mengembalikan nilai apapun. boleh tidak ditulis, krn secara default tidak ditulis.
fun cetakPesan(pesan: String?): Unit{
    if(pesan==null){
        println("Pesan tidak boleh kosong")
    }else{
        println("Pesan diterima")
    }
}

// Return nilai Int
fun tambah(a: Int, b:  Int): Int{
    val total = a+b
    return  total
    
}

fun main() {
    cetakPesan(null)
    println(tambah(1,2))

}