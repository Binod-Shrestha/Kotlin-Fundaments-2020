
fun main(args:Array<String>){
    var studentOne = Student()
    println("Passed: "+studentOne.hasPassed(55))
    println("Scholarship: "+studentOne.gotScholarShip(98))


}

fun Student.gotScholarShip(marks: Int): Boolean{ // this class injection provides the extension
    return marks > 90
}

class Student {
    fun hasPassed(marks:Int): Boolean {
        return marks > 50
    }
}