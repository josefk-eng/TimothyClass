package anotherPackage

import kotlin.reflect.jvm.internal.impl.utils.SmartSet

class MyNormalClass()

data class MyDataClass(val param1:String)


enum class User(val param:String){
    NormalUser(""),
    Admin("Josef");

    fun doSomething(){
        println(param)
    }
}

sealed class MyResult

//Object
data class Sucecess(val data:String):MyResult()
data class Failure(val exception:Exception):MyResult()
object InProgress:MyResult()

fun main() {
    val instanceOne = MyNormalClass()
    val instanceTwo = MyNormalClass()

    val user = User.Admin
    user.doSomething()

    fun getApi():MyResult{
        //do actual call
        try {
            return Sucecess(data = "Some data")
        }catch (e:Exception){
            return Failure(exception = e)
        }
    }

    when(getApi()){
        is Failure -> {}
        InProgress -> {}
        is Sucecess -> {}
    }

    val myObject = object  {
        val param1:String = ""
        val param2:String = ""
        val param3:String = ""
        val param4:String = ""

        fun doSomething(){
            //doSomething
        }
    }

    myObject.doSomething()

}
class Main{

    object singletonInstance{
        val singleton = Singleton()
        fun myFunction(){

        }
    }

    fun main(args: Array<String>){
        singletonInstance.singleton
    }
}

class Singleton{

}