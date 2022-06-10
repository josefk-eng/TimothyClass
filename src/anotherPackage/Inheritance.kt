//package anotherPackage
//
//open class Animal(){
//    open fun makeSound(){
//        print("Make Generic Sound")
//    }
//}     //-> First
//
//open class WildAnimal:Animal(){
//    override fun makeSound() {
//        super.makeSound()
//    }
//} // -> Second
//
//open class DomesticAnimal:Animal(){
//    override fun makeSound() {
//        super.makeSound()
//    }
//}
//
//class Tiger:WildAnimal() // -> Third
//
//class Dog:DomesticAnimal()
//
//class Cat:DomesticAnimal(){
//    override fun makeSound(){
//        println("Make a meow sound")
//    }
//}
//
//fun main(args: Array<String>){
//    val animal: Animal = Dog()
//    animal.makeSound()
//}