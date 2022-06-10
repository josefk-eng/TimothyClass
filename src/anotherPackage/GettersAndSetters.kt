package anotherPackage

class GettersAndSetters {
    var param1: String? = null
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