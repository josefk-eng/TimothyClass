package anotherPackage



import java.util.*

open class A

class B:A(){
    //function
}

fun main() {
    val d = arrayOf(3,5,6,7,8)
    d[0] = 5
    println(d.contentToString())
    val c = d.copyOf()
    println(c.contentToString())


    val myArray = arrayOf(3,4,6,7)
//intArrayOf(), booleanArrayOf(),
//hackerRank, Codility
    myArray.myOwnFunction()
    myArray.contentToString()
    myArray[0] = 6
    myArray.contentToString()
    myArray.size
    val copy = myArray.copyOf()
    copy.contentToString()
    copy.set(3, 10)
    copy.contentToString()
//myArray.contentToString()
    val myNewArray = myArray.reversedArray()
    myNewArray[1] = 10
    myNewArray.contentToString()
    myNewArray.contentToString()

    val newArray = myArray.reversed()
    newArray

}

fun Array<Int>.myOwnFunction(){
    //do stuff
}