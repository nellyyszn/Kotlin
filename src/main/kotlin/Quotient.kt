import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)
    println("Enter first number")
    var firstnumber=reader.nextInt()
    println("Enter second number")
    var secondnumber=reader.nextInt()

    var quotient=firstnumber%secondnumber
    println("The Quotient of the two numbers is $quotient")

}