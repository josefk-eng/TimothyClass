package anotherPackage

class ProcessData(val data: DataRetrieval){
    var myData:String? = null
    fun processData(){
        myData = data.getData()
    }
}


interface DataRetrieval{
    fun getData():String?
}

class GetsDataFromDb: DataRetrieval{
    override fun getData(): String {
        return "data from DB"
    }

}

class GetsDataFromFileStorage: DataRetrieval{
    override fun getData(): String {
        return "data from Storage"
    }
}

class GetsDataFromAnApi: DataRetrieval{
    override fun getData(): String? {
        return if (true) "data from an API" else  null
    }
}


fun main(args: Array<String>){
    val db:DataRetrieval = GetsDataFromDb()
    db.getData()

}

