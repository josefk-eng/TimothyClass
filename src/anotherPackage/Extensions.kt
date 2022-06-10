package anotherPackage

import java.lang.StringBuilder
import java.util.*

fun String.capitalizeFirstLetter():String{
    val str = this.split(" ")
    val builder = StringBuilder()
    for (i in str){
        builder.append(i.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
        if(i != str.last()) builder.append(" ")
    }
    return builder.toString()
}

fun Int.doubleThisInteger():Int{
    return this*this
}


fun myFunctionThatUsesManipulatedString(){
    println("my age is not important".capitalizeFirstLetter())
}

class Radio(val frequency:String){
    fun play(){
        println("Playing audio from fm: $frequency")
    }
}

class Car(val radio: Radio, val carName:String){
    fun printName(){
        print(carName)
    }

    fun Radio.audioDetails(){
        printName()
        print(" : ")
        radio.play()
    }

    fun showCarAudioDetails(){
        radio.audioDetails()
    }

}

fun main() {
    myFunctionThatUsesManipulatedString()
    println("${2.doubleThisInteger()}")
    val car = Car(Radio("94.9"),"Cardilac")
    car.showCarAudioDetails()
}