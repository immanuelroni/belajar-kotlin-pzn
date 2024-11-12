/*
    kadang kita butuh input dari parameter dari luar, sepeti konfigurasi database dll
    mirip main fun utama dalam Java
    mirip command line.
    cara cek inputan lewat edit configuration, bagian programs arguments
 */

// Array of String dari luar file ini
/**
 * Contoh function dengan arguments parameters
 * @param name nama parameter
 */
fun main(args:Array<String>) {
    for (x in args){
        println(x) // ini akan print teks dari program arguments yang saya tulis di bagian configuration
    }
    // cara edit paramnya melalui more action, edit, ubah pada Program Arguments, bisa isi String, atau "Nama" terserah.
}

/**
 * ini cara bikin multi comment
 */