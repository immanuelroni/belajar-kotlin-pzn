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
}