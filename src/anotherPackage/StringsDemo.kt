package anotherPackage

fun main() {
    println("Hello World")
    val name = "Josef"
    println("Hello, $name")
    println("Your name is ${name.count()} characters long")
    val myJson = """
    {
        "name":"Mark"
        "lastName":"Josef"
        "age":"29"
    }
""".trimIndent()
    println(myJson)

//val fromStdIn = readLine()
//val fromFile = File("input.txt").readText()

    val myString = buildString {
        repeat(10){
            append("Hello, ")
            append(name)
            appendLine("!")
        }
    }

    println(myString)
    println("   ".isBlank())
    println("".isEmpty())
    val replaceBlanks = " ".ifBlank {
        "never blank"
    }
    println(replaceBlanks)

    val input = "   valuable infor       "
    println(input.trim())


    val input2 = "##placeholder##"
    println(input2.removePrefix("##"))
    println(input2.removeSuffix("##"))
    println(input2.removeSurrounding("##"))


    val stringA = "aString"
    println(stringA == "aString")
    println("a" < "b")
    println("a" > "c")

    val input3 = "QuiCK BroWN FoX"
    println(input3.equals("Quick Brown Fox", ignoreCase = true))

    val input4 = "A; B; C; D; E"
    val newStr = input4.split("; ")
    println(newStr)
    println(input4.split("; ", limit = 3))
    println(myJson.lines())

    println(stringA[1])

    println(input3.filter { it.isUpperCase() })

}