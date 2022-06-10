package anotherPackage

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

//reusable blocks of code
class Functions {
    fun myBasicFunction(){
        //do something
    }

    fun myReturnFunction():Int{
        //do something
        return 0
    }

    fun myParameterizedFunction(param1:String, param2:String):String{
        //do something that requires param1 and param2
        return "" //return the results
    }

    fun myDefaultParameterFunction(param1: String = "default value", param2: String){
        //do something
    }

    fun myNestedFunction():String{
        return myParameterizedFunction(param1 = "param1", param2 = "param2")
    }

    //overloaded function
    fun myParameterizedFunction():String{
        //do something
        return ""
    }

    private fun myRestrictedFunction(){}

    fun myExpressionFunction(param1: Int):Boolean = param1 % 2 == 0

    fun myVariableArgumentFunctions(vararg numbers:Int): Int{
        return numbers.sum()
    }

    fun myFunctionThatReturnsVoid(param1: String):Unit{
        //do something
        return
    }

    fun myFunctionThatTakesAnotherFunctionAsArgument(myFunction:(Int)->Unit){
        //do something with the functional parameter
    }

    //other functions -> infix, inline, lambda, extension, higher order functions and so on
}