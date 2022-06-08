package anotherPackage
class Person{
    lateinit var firstName:String
    var age:Int = 0 //property
    val lastName:String = ""

    constructor(){          //Primary Constructor
        println("This is a primary constructor")
    }

    constructor(firstName:String):this(){    //Secondary Constructor
        this.firstName = firstName
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

}


class UserProfile(val username:String, val password:String)
val profile = UserProfile("josef", "hghjaghjd")
val person = Person(0)
















