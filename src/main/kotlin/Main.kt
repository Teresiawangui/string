fun main() {
   school("akirachix")
    sentence("mercy",20)
    textString("mary")
    text("nancy")
    data("mary njeri",20,+254709987651L,45.8F,"tanzania")
    isEven(34)
    extract("miriam")
    temperature(45.45)

}
//1. Given a string "akirachix". Write a function that prints out a string composed of the first, third and fourth characters of the string (4 points)//
fun school(name:String){
    var a= name[0]
    var b= name[2]
    var c= name[3]
    var word= a+" "+b+" "+c
    println(word)


}
//2. Write a function that takes in 2 parameters, name and age and returns a String with this structure "Hi, my name is x and I am y years old." Where x and y are the provided name and age respectively. (6 points)//
fun sentence(name:String, age:Int):String{

    var text= "Hi, my name is $name and Iam $age years old"
    return text


}
//3. Write a function that takes in a String and returns its length (4 points)//
fun textString(word:String):Int{
    return word.length
}
//4. Write a function that takes in a name and prints out "That's me!" when your name is passed to it, otherwise it prints out "I don't know who that is" (6 points)//
fun text(name:String) {
    if (name == "nancy") {
        println("Thats me!")
    } else {
        println("I dont know who that is")
    }


}
//5. You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number, weight in kg and citizen. For the
//citizen field, you will track whether a student is a Kenyan or not. (6 points)//
fun data(fullName:String, age:Byte,phoneNumber:Long,weightInkg:Float,citizen:String){
    println(fullName)
    println(age)
    println(phoneNumber)
    println(weightInkg)

    if (citizen == "kenyan"){
     println("true")
    }else {
        println("false")
    }


}
//6. Write a Kotlin function named isEven that takes an integer as a parameter and returns a Boolean indicating whether the number is even or odd. (4 points)//
fun isEven(number:Int):Int {
    if (number %2==0) {
        println("even")
    } else {
        println("odd")
    }
    return number
}
//7. Create a kotlin function that extracts a substring from a given string starting from index 2 to index 5 using the slice function and returns it. (6 points)//
fun extract(word:String):String{
     return(word.slice(2..5))
}
//8. Implement a Kotlin program that declares a variable temperature of type Double and assigns it a temperature value. Then, print a message saying "The temperature is [temperature] degrees Celsius." (4 points)//
fun temperature(temp:Double){
    var temperatureSentence="The temperature is $temp degrees Celsius"
    println(temperatureSentence)
}










