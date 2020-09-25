
fun main(args:Array<String>){
    var studentOne = Student()

    println("======Example-1========")
    println("Passed: "+studentOne.hasPassed(55))
    println("Scholarship: "+studentOne.gotScholarShip(98))
    println("======Example-2========")

// Example:2
    var title: String = "Mr."
    var firstName: String = "Binod"
    var lastName: String ="Shrestha"
    println(title.add(firstName,lastName))
    println("======Example-3========")


    // Example:3
    var numberOne: Int = 9
    var numberTwo: Int = 15
    println("Greater Number: "+numberOne.greaterThan(2))
    println("Greater Number: "+numberOne.greaterThan(numberTwo))

}



fun Student.gotScholarShip(marks: Int): Boolean{ // this class injection provides the extension
    return marks > 90
}

class Student {
    fun hasPassed(marks:Int): Boolean {
        return marks > 50
    }
}

//another example
fun String.add(firstName: String, lastName:String): String{
    return this+" "+firstName+" "+lastName
}

fun Int.greaterThan(newNumber: Int): Int {
     if(this > newNumber){
         return this
     }else{
         return newNumber
     }
}