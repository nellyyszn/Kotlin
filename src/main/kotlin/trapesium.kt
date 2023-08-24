import java.util.Scanner
fun main() {
println("Fomula: a+b * height * divider")

    var reader = Scanner(System.`in`)
    println("Enter a :")
    var a = reader.nextDouble()

    println("Enter b :")
    var b = reader.nextDouble()

    println("Enter divider :")
    var divider =0.5

    var sum= a+b

    println("Enter height:")
    var height = reader.nextDouble()

    var Area = sum * height * divider

    println("The Area of the Trapezium is $Area square units")
}