class Animal(var colour:String,var size:Int){
    fun eat(){
    println("Eating")
}
    fun sleep(name:String){
        println("The animal is $name")
    }
    fun woof(){
        println("woofing")
    }
    fun main(){
        var a=animal("white",34)
        var f=animal("black",20)
        f.sleep("fish")
        var l=animal("white",45)
        l.sleep("leopard")
    }
}