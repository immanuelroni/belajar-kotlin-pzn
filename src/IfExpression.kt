/*
    IF EXPRESSION
    if(kondisi boolean){
    jika benar
    }else{
    jika salah
    }

    ELSE IF
    if(kondisi boolean){
    // jika kondisi boolean terpenuhi
    }else if (Kondisi boolean 2){
    }else{
    }
 */

fun main(){
    val nilaiUjian = 80
    if(nilaiUjian>=80){
        println("Lolos Ujian")
    }else if (nilaiUjian>70){
        println("Belajar Lagi")
    }else{
        println("Kamu malas! Fak!")
    }

}