/*
    Matematika
    +
    -
    *
    /
    % = modulo atau sisa bagi
 */

fun main(){
    // Hati-hati dalam Int akan menghasilkan nilai Int jadi hasilnya akan 3 tanpa ada koma
    // Lebih baik gunakan double
    var hasil1: Int = 10/3
    println(hasil1)

    var hasil2: Int = 10+2/2
    println(hasil2)

    // Penggunaan Double
    var hasil4 = 10.0/3.0
    println(hasil4)

    /*
    Augmented Assignment
    a=a+a sama dengan a+=10
    a=a-a sama dengan a-=10
    a=a*a sama dengan a*=10
    a=a/a sama dengan a/=10
    a=a%a sama dengan a%=10

     */
    var total: Int = 0
    val barang1 = 100
    val barang2 = 200
    val barang3 = 300

    total+=barang1
    total+=barang2
    total+=barang3
    println(total)

    /* Unary Operator
    ++ sama dengan a=1+1 Intinya dipakai untuk nambah 1 jadi misla total++ hasilnya akan jadi 601
    -- sama dengan a=a-1
    - sama dengan negative
    = sama dengan positive
    ! Boolean kebalikan
    */

    total++
    println(total)

    var suhu = -2
    println(suhu)
    println(suhu)
}