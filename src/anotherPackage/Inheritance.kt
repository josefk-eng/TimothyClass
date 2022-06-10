package anotherPackage

open class Animal

open class WildAnimal:Animal()

open class DomesticAnimal:Animal()

class Tiger:WildAnimal()

class Dog:DomesticAnimal()

class Cat:DomesticAnimal()

fun main(args: Array<String>){

}