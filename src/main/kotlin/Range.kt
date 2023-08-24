fun main(){

    for (number in 1..10){
        println(number)

    }
    //Break
  for (letter in 's'..'z')
      print(letter)
  for (myletter in 'a'..'d'){
      if(myletter=='c'){
          break
      }
      println(myletter)
      //continue
      for (number in 20..30){
          if (number==25){
              continue
      }
          println(number)
          }
          
  }

}
