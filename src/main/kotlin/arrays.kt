fun main() {
    var language = arrayOf("Kotlin", "java", "PHP")

    //Accesing an element
    println(language[0])


    //reassigning a value
    language[1] = "python"
    for (x in language)
        println(x)


    //Size of the array
    println(language.size)


    //Adding an element to an array
    var new=language.plus("C++")
    for (b in new)
        print(b)
     }

