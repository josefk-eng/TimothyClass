import kotlin.random.Random

val arr = arrayListOf<String>()
val fruits = listOf(
    "Apple",
    "Banana",
    "Cherry"
)


val anotherList = List(5){index->"No. $index"}
anotherList

"wordsToLetters".toList()

val myPair = mapOf(
    1 to "Gold",
    2 to "Silver",
    3 to "Bronze",
    4 to "Others"
).toList()



val listFromSeq = generateSequence {
    Random.nextInt(100).takeIf { it > 30 }
}.toList()

listFromSeq

val listFromARange = (0..10).toList()

val modiffiable = listFromARange.toMutableList()

val changeableList = mutableListOf(3,5,7,9,2)

val acopy = changeableList.toList()

changeableList[1] = 0

changeableList

acopy

val listToAccess = listOf("john","mark","Enoch")

listToAccess[2]

listToAccess.get(2)

listToAccess.getOrNull(3)

listToAccess.getOrElse(3){
    println("There is no index $it!")
    "Lewis"
//    "hhsghj"
}

val listOfNullableElements : List<Int?> = listOf(1,2,null,4)

val arrayList = arrayListOf(6,7,9)


val item = listOfNullableElements[2] ?: 0

val listToSlice = listOf("a","b","c","d","e")


listToSlice.slice(listOf(0,2,4))

listToSlice.slice(0..3)

listToSlice.slice(0..listToSlice.lastIndex step 2)

listToSlice.slice(2 downTo 0)

val modifiableList = mutableListOf(1,2,3)

modifiableList.add(4)

modifiableList += 5

modifiableList

modifiableList.add(3, 10)

modifiableList += listOf(6,7,8,9,10)

modifiableList

modifiableList -= 10

if(modifiableList.remove(10)){
    println("element removed")
}
//you can also use removeAt() to specify the index

modifiableList

modifiableList -= listOf(1,4)
modifiableList

modifiableList.fill(0)

modifiableList

modifiableList.clear()

val l = listOf(3,1,4,9,1,5)
l

l.shuffled()

l.sorted()

l.reversed()


val anotherModifiable = l.toMutableList()

anotherModifiable.shuffle()
anotherModifiable
anotherModifiable.sort()
anotherModifiable
anotherModifiable.reverse()
anotherModifiable


anotherModifiable.removeAll{
    it<5
}
anotherModifiable

val letters = mutableListOf('a','b','3','d','5')
letters
letters.retainAll{it.isLetter()}
letters

//views on lists
val animals = mutableListOf("cat","dog", "mouse","horse","rat","lion")

val sub = animals.subList(1, 4)
sub

animals[2] = "tiger"

sub

sub[1] = "Jaguar"

animals

sub.fill("_")

animals

sub

for (fruit in fruits){
    println(fruit)
}

fruits.forEach{
    println(it)
}

//transform a collection
fruits.map {
    it.reversed()
}

val stuf = listOf(
    "1",
    "2",
    "three",
    "4",
    "V",
)
stuf.mapNotNull {
    it.toIntOrNull()
}

stuf.mapIndexed { index, s ->
    "$s,-> ($index)"
}

//get elements that conform to a condition
open class Person(
    val name: String,
    val age: Int,
    val driversLicense: Boolean = false
){
    override fun toString(): String = "$name -> age: $age, hasLicense? ${if(driversLicense) "yes" else "No"}"
}

class Cyborg(name:String):Person(name,99)

val people = listOf(
    Person("Joe",15),
    Person("Agatha",25, true),
    Person("Ambar",19),
    Cyborg("Rob"),
)

val major = people.filter {
    it.age >= 18
}
val minor = people.filterNot {
    it.age >= 18
}
major
minor
people.partition {
    it.age >= 18
}

people.filterNotNull()
val cyborgs = people.filterIsInstance<Cyborg>()
cyborgs

fruits
fruits.take(2)
fruits.drop(1)
fruits

val randomNumbers = listOf(
    3, 2, 6, 3, 8, 2, 8, 0
)
randomNumbers.average()
randomNumbers.sum()

val randomNames = listOf(
    "Dallas", "Kane", "Ripley", "Lambert"
)

randomNames.sumOf {
    it.length
}

randomNumbers.maxOrNull()
randomNumbers.minOrNull()

randomNames.maxOf {
    it.length
}

randomNames.minOf {
    it.length
}

randomNumbers.count()
randomNames.count { it.length > 5 }

randomNumbers.joinToString(
    separator = "-",
    prefix = "Pi://",
    limit = 5
){
    "[$it]"
}

//advanced operations
people
people.any { it.driversLicense }
people.none { it.age<18 }
people.all { it.name.length < 7 }

val oddNumbers = generateSequence(1) {
    if(it<10) it+2 else null
}.toList()

oddNumbers

oddNumbers.chunked(2)
oddNumbers.chunked(2){
    it.reversed()
}

oddNumbers.windowed(3)
oddNumbers.windowed(4, 2, true)
oddNumbers.windowed(4, 2, true){
    it.reversed()
}
oddNumbers.windowed(3).flatten()

listOf("Joseph", "Timothy", "Anthony").flatMap {
    it.toList()
}

val germanCities = listOf(
    "Aachen",
    "Bielefield",
    "Munchen"
)

val germanLicensePlates = listOf(
    "AC",
    "BI",
    "M"
)

germanCities.zip(germanLicensePlates)
val citiesToPlates = germanCities.zip(germanLicensePlates){city, plate ->
    city.toUpperCase() to plate.toLowerCase()
}

val (cities, plates)  = citiesToPlates.unzip()
cities
plates

val someRandoms = listOf(3,1,5,3,6,8,9,4,6)

val mySet = someRandoms subtract listOf(4,6,3,7,1)

mySet

someRandoms.zipWithNext()

someRandoms.zipWithNext{a, b -> a-b}

someRandoms.reduce {acc, value ->
    acc * value
}

val someFruits = listOf("apple", "cherry","banana","orange")

someFruits.fold(1){acc, value ->
    acc * value.length
}

someFruits.runningFold(1){acc, value ->
    acc * value.length
}