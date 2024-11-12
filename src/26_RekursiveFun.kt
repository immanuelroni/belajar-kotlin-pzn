/*
    Adalah sebuah fungsi yang memanggil dirinya sendiri
    Salah satu yang sering dipakai adalah faktorial
 */



fun main() {
    fun factorial(n: Int): Long {
        return when (n) {
            0, 1 -> 1
            else -> n * factorial(n - 1)
        }
    }

    fun factorialWithLoop(value:Int):Int{
        var hasil = 1
        for (i in value downTo 1){
            hasil*=i
            /*
                bakal
                5*1 = 5
                5*4 = 20
                20*3 = 60
                60*2 = 120
             */
            println("$i: $hasil")
        }
        return hasil
    }

    println(factorial(2)) // Output: 120
    println(factorialWithLoop(5))
    println(factorialWithLoop(10))
}