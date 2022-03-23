fun main(){
var personA=Human("Akuot",23,64)
 personA.weight
 personA.eat(3)

 var words=personA.Speak("I love AkiraChix")
 println(words)
 var girl=personA.birthday()
 println(girl)


 var student=user("James","Owoko","jamesowoko@gmail.com",732535385,"Jamoo")
println(student.lastName)
 println(student.password)
}


class Human( var name:String, var age:Int,var weight:Int){
 fun eat(foodWeight:Int){
  weight += foodWeight
  println("I am eating $foodWeight kgs of food")

 }

fun Speak(speech:String):String {
 return speech
}

fun birthday(){
 age +=1
 println(age)

}



 }
data class user(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String)
