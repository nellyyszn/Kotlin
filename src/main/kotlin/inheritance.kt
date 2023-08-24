import java.security.KeyStore.TrustedCertificateEntry

//Parent class/Super class/Base class
open class Animal1{
    var color="Brown"
    fun eat(){
        println("Animal is eating")
    }
}
//Child class/Sub class/Derived class

open class Dog1:Animal1(){
    var  name="Seberian husky"
    fun sound(){
        println("Dog is barking")
    }
}
class cat1:Dog1(){
    var hasFur=true
    fun meow(){

    }
}
fun main(){
    var a=Animal1()
    println(a.color)


    var d=Dog1()
    d.eat()

    var c=cat1()
    c.meow()
    println("Cat has fur")
}