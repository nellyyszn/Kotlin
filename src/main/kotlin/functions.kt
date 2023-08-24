import javax.naming.Name

fun main(){
    //Standard Library Functions
    println("Hello kotlin")
    var squareroot=Math.sqrt(81.0)
    println(squareroot)
    var number=Math.round(34.56)
    println(number)
    var num=Math.ceil(45.2)
    println(num)

    sum()
    product(34,10)
    divide(20,5)
    details(name ="Nelly"
        , age = 18)
}


//User-defined function
fun sum() {
    var num1 = 3
    var num2 = 4
    println(num1 + num2)

}
fun product(x:Int,y:Int){
    println(x*y)
}
fun divide(first:Int,second:Int) {
    println(first / second)
}
 fun details(name:String,age:Int){
     println("My name is $name.I am $age years")
 }


