package review

import anotherPackage.Person

fun main(){
    accessDB(url = "remote url", success = {person -> success() }){
        failure(it)
    }
}

//
fun accessDB(url:String, success:(Person)->Unit, failure:(Exception)->String){
    try {
        //Some long running operations
        success(Person(fName = ""))
    }catch (e:Exception){
        failure(e)
    }
}

fun success(){
    println("Succeeded")
}
fun failure(e:Exception):String{
    println(e)
    return ""
}