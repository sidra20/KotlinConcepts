import java.util.Scanner

fun main(args: Array<String>) {
    val t1 = Teacher("Mis tazeen", "North Karachi", 331232063,"BSCS");
    val s1 = Student("Maham", 2434, "Block S", 2.7)
    val s2 = Student ("Samra", 2076, "Gulshan", 3.0)
    val s3 = Student ("Kiran ", 3409, "North", 3.2)
    val s4= Student ("Ramsha", 2357, "North Nazimabaad", 3.2)
    val s5 = Student ("Hiba", 2402, "Nazimabaad", 3.4)
    var arr:Array<Student> = arrayOf(s1,s2,s3,s4,s5)
    val course = Course("Python",arr,t1)
    course.printDetails()
}

class Student(var name: String, var rollNo: Int, var address: String, var GPA: Double)
{
}
class Teacher(var name: String, var address: String, var telephoneNo: Int, var degree: String)
{
}
class Course(var name: String, var students: Array<Student>, var teacher: Teacher)
{
    fun printDetails()
    {
        println("Course Name " + name)
        println("****Details of the teacher assigned to the course $name: *****")
        println("Teacher Name: " + teacher.name)
        println("Teacher's Address: " + teacher.address)
        println("Telephone Number: " + teacher.telephoneNo)
        println("Last Degree: " + teacher.degree)
        println("\n****Names and roll numbers of the students enrolled in $name: ***")
        for(i in 0..4)
        {
            println("Name: " + students[i].name)
            println("Roll Number: " + students[i].rollNo)
        }
    }
}