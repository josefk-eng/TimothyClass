package anotherPackage

import kotlin.coroutines.CoroutineContext
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

//reusable blocks of code

class Functions {
    private val property:String? = null
    fun myBasicFunction(){
        //do something
    }

    fun myReturnFunction():Int{
        //do something
        return 0
    }

    fun myParameterizedFunction(param1:String, param2:String):String{
        //do something that requires param1 and param2
//        val temp = param1
//        temp.toUpperCase()
        return "" //return the results
    }

    fun myDefaultParameterFunction(param2: String, param1: String = "default value"){
        //do something
    }

    fun myNestedFunction():String{
        val someValue = myParameterizedFunction(param1 = "param1", param2 = "param2")
        //do something

        return ""
    }

    //overloaded function
    fun myParameterizedFunction():String{
        //do something
        return ""
    }

    private fun myRestrictedFunction(){}

    fun myExpressionFunction(param1: Int):Boolean = param1 % 2 == 0

    fun myExpressionFunction2(param: Int): Boolean{
        return param % 2 == 0
    }

    fun myVariableArgumentFunctions(param:String, vararg numbers:Int, ): Int{
        return numbers.sum()
    }

    fun myFunction(a:Int){
        //does something
    }

    fun myFunctionThatReturnsVoid(param1: String):Unit{
        //do something
        return
    }

    fun apiCall(sucess:(String)->Unit, failure:(Exception)->Unit){
        try {
            //delay Waiting results
                //throw Exception("The network is disconnected")
           Thread.sleep(2000)
            sucess("Joseph")
        }catch (e: Exception){
            failure(e)
        }

    }

    fun myFunctionThatTakesAnotherFunctionAsArgument(myFunction:(Int)->Unit){
        //do something with the functional parameter
    }

    //other functions -> infix, inline, lambda, extension, operator functions and so on

    fun String.myExtensionFunction(param1: String, param2: String): String{
        return this + param1 + param2
    }

    infix fun Int.myInfixFunction(a: Int):Int{
        return this.plus(a)
    }

    operator fun Int.plus(b:Int): Int{
        return this + b
    }

    inline fun myInlineFunction(param1: String,param2: ()->Unit){
        param2()
    }

}

fun String.concat(anotherString: String): String{
    return this + " : " +anotherString
}

class PersonOne(val name:String, val age:Int){

}

infix fun Int.plus(a: Int):Int{
    return this + a
}

fun PersonOne.printName(){
    println(this.name)
}

infix fun PersonOne.isOlderThan(anotherPersonOne: PersonOne):Boolean{
    return this.age > anotherPersonOne.age
}



class Point(val x:Int, val y:Int){
    operator fun minus(point: Point): Point{
        return Point(-point.x, -point.y)
    }
}

class Login{
    val name = ""

    companion object{
        val BASE_URL = ""
        operator fun invoke(param1: String):String{
            println("Hello there")
            return ""
        }
    }
}






fun main() {
    val fn = Functions()
    fn.myVariableArgumentFunctions("jkfekjhkewl",1,2,3,4,5)
//    fn.myFunctionThatTakesAnotherFunctionAsArgument(myFunction = {
//
//    })
//    fn.apiCall(sucess = {result->
//        println("The api is successful and the result is $result")
//    }, failure = {
//        println("Oops, the call has failed ${it.message}")
//    })


    val stringOne = "stringOne"
    val stringTwo = "stringTwo"
    val stringThree = stringOne.concat(stringTwo)
//    println(stringThree)
    val joseph = PersonOne("josef", 78)
    val Jimmy = PersonOne("Jimmy", 50)
    joseph.printName()

    val isJosefOlderThanJimmy = joseph isOlderThan Jimmy

    var age = 8
    val increment  = age.plus(2)
    val point = Point(10, 20)
    point.minus(point)
//
//    val login = Login()
//    login.name
    val result = Login(param1 = "")



}
