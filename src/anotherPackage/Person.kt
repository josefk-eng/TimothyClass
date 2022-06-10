package anotherPackage
class Person{
    lateinit var firstName:String
    var age:Int = 0
    val lastName:String = ""

    constructor(){
        println("This is a primary constructor")
    }

    constructor(fName: String):this(){
        firstName = fName
        println("This is a Secondary constructor")
    }

    constructor(age:Int):this(""){
        println("This is another Secondary constructor")
    }

    init {
        println("This is a init block")
    }

    fun isMinor():Boolean{
        return this.age<18
    }

    fun someRandomFunction(){
        println("$firstName")
    }

}

















