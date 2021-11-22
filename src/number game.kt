import java.lang.Exception
import kotlin.random.Random

fun main(){
    val answer = Random.nextInt(0, 11)
    var num1 = 0 // first var
    var num2 = 0 // second

    print("Enter your first number: ") // Sentence first number

    try {
        num1 = readLine()!!.toInt()
    }catch (e: Exception){        // when writing a letter first number

        println("Please enter numbers only.")
    }

    print("Enter your second number: ") // sentence second number

    try {
        num2 = readLine()!!.toInt() // when writing aletter ...second number
    }catch (e: Exception){
        println("Please enter numbers only.")
    }

    val solution = num1 * answer + num2
    println("$num1 * X + $num2 = $solution")

    print("What is X? >> ")

    try {
        if(readLine()!!.toInt() == answer){
            println("You got it!")
        }else{
            println("Wrong guess. The correct answer is $answer.")
        }
    }catch (e: Exception){
        println("Please enter numbers only.")
    }
}