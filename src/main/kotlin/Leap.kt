import java.util.Scanner
fun main(){
  var reader=Scanner(System.`in`)
  println("Enter a leap year")
  var  leap =reader.nextInt()

  if (leap%4==0){
    println("Year is leap")
  }
 else{
   println("Not a leap year")
  }


}
