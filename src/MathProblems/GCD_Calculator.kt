package MathProblems

import java.util.*

fun main(str:Array<String>)
{
    val readUserInput = Scanner(System.`in`)

    print("Please Enter 1st Number :\n")
    val firstNumber = readUserInput.nextInt()

    print("Please Enter 2nd Number :\n")
    val secondNumber = readUserInput.nextInt()

    print("GCD of $firstNumber and $secondNumber is ${calculateGCD(firstNumber, secondNumber)}" )
}

fun calculateGCD(firstNumber: Int, secondNumber: Int):Int
{
    if(firstNumber == 0)
        return secondNumber

    return calculateGCD(secondNumber%firstNumber, firstNumber)
}
