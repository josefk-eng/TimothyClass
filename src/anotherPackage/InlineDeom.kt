package anotherPackage

class InlineDeom {
    inline fun myInlineFunction(param:(a:Int, b:Int)->Unit){
        param(3, 5)
    }


}

fun main() {
    val demo = InlineDeom()
    demo.myInlineFunction(param = {a, b->
        println("Hello there")
    })
}