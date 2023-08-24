import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)
    println("Enter fnumber:")
    var fnumber=reader.nextDouble()

    println("Enter snumber:")
    var snumber=reader.nextDouble()

    println("Enter tnumber")
    var tnumber =reader.nextDouble()

    if (fnumber>snumber && fnumber>tnumber){
        println("$fnumber is the largest")
    }
    else if (snumber>fnumber &&snumber>tnumber){
        println("$snumber is the largest")
    }
    else{
        println("$tnumber is the largest")
    }
}
