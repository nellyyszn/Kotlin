open class Employee1{
    fun name(){
        println(" Nellyy")
    }
    fun age(){
        println(18)
    }
    fun salary(){
        println(45000.00)
    }

}
class Webdeveloper:Employee1(){
    fun website(){
        println("Ecommerce")
    }
}
class Andrioideveloper:Employee1(){
    fun Andrioid(){
        println("My first app")
    }
}
class IOSDeveloper:Employee1(){
    fun IOS(){
        println("Just print")
    }
}
fun main(){
    var a=Andrioideveloper()
    a.salary()



}