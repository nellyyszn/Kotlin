open class shape(){
    var area=156
    fun area(){
        println("area")
    }
}
class Rectangle:shape() {
    var length =4
    var width = 5
    fun getlength() {
        println(4)
    }
    fun getbreath() {
            println(5)
        }

}
class Circle:shape(){
    var radius = 14
fun getradius(){
    println(14)
}
}

fun main(){
    var r=Rectangle()
    r.getbreath()

    var c=Circle()
    println(c.radius)


}

