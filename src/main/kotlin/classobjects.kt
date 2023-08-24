class person(){
    //Attribute/Property/Variable
    var name="Nellyy"
    var skintone="black beauty"
    var age=18

    //Method/Function
    fun eat(){
        println("eating")
    }
    fun walk(){
        println("Walking")
    }
}
fun main(){
    //Object 1
    var teacher=person()
    println(teacher.age)
    teacher.walk()
    //Object 2
    var accountant=person()
    println(accountant.name)
    accountant.eat()

}