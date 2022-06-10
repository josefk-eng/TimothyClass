package anotherPackage

import java.util.*

class GettersAndSetters {
    var param1: String? = null
    set(value) {
        field = value?.uppercase(Locale.getDefault())
        //print(field)
    }
        //public setParam1(String newValue){
        //      this.param1 = newValue
        // }
    get() {
        println("I am being called")
            return field
        }
    var param2: String? = null


    constructor(){}

    constructor(param1:String, param2: String){
        this.param1 = param1
        this.param2 = param2
    }

    fun someRandomFunction(){
        println("Some Random function ${param1}")
    }
}

fun main() {
    val gettersAndSetters = GettersAndSetters("hjgdhjg","")
    println(gettersAndSetters.param1)
    gettersAndSetters.someRandomFunction()

}