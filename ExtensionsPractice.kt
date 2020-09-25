
fun main(args:Array<String>){
    var studentOne = Student()
    println("Passed: "+studentOne.hasPassed(55))
    println("Scholarship: "+studentOne.gotScholarShip(98))

// Example:2
    var title: String = "Mr."
    var firstName: String = "Binod"
    var lastName: String ="Shrestha"
    print(title.add(firstName,lastName))
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