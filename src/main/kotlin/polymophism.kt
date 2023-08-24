import java.awt.Shape

//parent class

 open class shape1{
    open fun draw(){
        println("It is a shape")
    }
}
//Child class
class rectangle:shape1(){
    override fun draw(){
        println("Rectangle")
    }

}

class Square:shape1(){
    override fun  draw(){
        println("Square")
    }

}
fun main(){
    var r=Rectangle()


    var s=Square()
    s.draw()

    var shape=shape1()
    shape.draw()


}