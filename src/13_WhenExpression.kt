fun main(){
    val finalExam = 'A'
    when (finalExam){
        'A'-> {
            println("Amazing")
        }
        'A'-> {
            println("Good")
        }
        'B'-> {
            println("Not Bad")
        }
        'C'-> {
            println("Bad")
        }
        'D'-> {
            println("Very Bad")
        }
        'E'-> {
            println("Fail")
        }
        else->{
            println("Try Again")
        }
    }

    // Multiple Option Case
    val username = 'C'
    when (username){
        'A','B','C'-> println("You Got an Access")
        else ->{
            println("Acess Denied")
        }
    }

    //WHEN IN

    val user = 'A'
    val listUserOK = arrayListOf('A','B','C')
    when (user){
        in listUserOK->{
            println("Akses diberikan")
        }
        !in listUserOK ->{
            println("Akses ditolak")
        }
    }

    // WHEN IS
    // Berguna untuk OOP
    val nama = "Roni"
    when (nama){
        is String -> println("Nama adalah String")
        !is String -> println("Nama bukan String")
    }

    //WHEN TANPA VARIABLE
    val kualitasSayur = 80
    when{
        kualitasSayur >=80 -> println("Kualitas Bagus")
        kualitasSayur >70 -> println("Kualitas lumayan")
        kualitasSayur <60 -> println("Kualitas jelek")
        else -> println("Kualitas tidak layak")
    }
    println("----------contoh kompleks----------")
    //-----------CONTOH KOMPLEKS--------------
    fun analyzeNumber(x: Any) {

        when {
            // Using when without argument
            x !is Int -> println("Not an integer")
            x == 0 -> println("Zero")
            x > 0 && x <= 10 -> println("Small positive number")
            x > 10 && x < 100 -> {
                // Multiple lines of code in a branch
                println("Medium number")
                println("Between 11 and 99")
            }
            x in 100..1000 -> println("Large number")
            else -> println("Out of ranges")
        }
    }

    // When as an expression with ranges and type checking
    fun getNumberDescription(x: Any): String = when (x) {
        is String -> "String of length ${x.length}"
        in 1..10 -> "Single digit number"
        in 11..99 -> "Two digit number"
        is Int -> if (x < 0) "Negative number" else "Other integer"
        !is Number -> "Not a number"
        else -> "Number out of ranges"
    }

    println(getNumberDescription(99))
    analyzeNumber(22)

}