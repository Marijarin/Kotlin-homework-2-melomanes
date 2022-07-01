package ru.netology

fun main(){
    val itemPrice = 100
    val discountFirst = 100
    val discountStartFirst = 1_000
    val discountStartSecond = 10_000
    val discountSecond = 0.05
    val discountMuso = 0.01
    val muso = true
    println("Введите число композиций, которые хотите купить, и получите свою скидку:")
    val itemValue = readLine()!!.toInt()

    val totalPrice = itemPrice * itemValue

    val result = if (totalPrice > discountStartSecond){
         totalPrice*(1-discountSecond)
    } else if (totalPrice > discountStartFirst){
        totalPrice - discountFirst
    } else {
        totalPrice
    }
    println("Стоимость покупки с учетом скидки за количество : $result")
    val resultInt = result.toInt()
    val musoResult = if (muso) resultInt * (1 - discountMuso) else {
        result
    }
    println("Стоимость покупки с учетом скидки меломана : $musoResult")
}


