package anotherPackage

abstract class Animal(){
    abstract val animalType:String
    abstract fun makeSound()
}

open class WildAnimal(override val animalType: String):Animal() {
    override fun makeSound() {
        TODO("Not yet implemented")
    }
}

open class DomesticAnimal(override val animalType: String) :Animal() {
    override fun makeSound() {
        TODO("Not yet implemented")
    }
}

class Tiger(override val animalType: String):WildAnimal(animalType)

class Dog(override val animalType: String):DomesticAnimal(animalType)

class Cat(override val animalType: String):DomesticAnimal(animalType)

//fun main(args: Array<String>){
//
//}

fun main() {
    val animal: Animal = Tiger("Tiger")
}