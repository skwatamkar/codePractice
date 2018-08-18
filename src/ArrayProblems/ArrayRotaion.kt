package ArrayProblems

import java.util.*

fun main(args:Array<String>)
{
    //init array
    val array:IntArray = intArrayOf(1,2,3,4,5,6,7)

    val userInput =  Scanner(System.`in`)
    println("Enter index position")
    val index = userInput.nextInt()

    reverseArray(array, index)
}

fun reverseArray(array: IntArray, indexArray: Int)
{
    val tempArray:IntArray = IntArray(indexArray+1)

    for ((index, value) in array.withIndex() )
    {
        if(index > indexArray)
        {
            break
        }
        else
        {
            tempArray[index] = array[index]
        }
    }

    println("Sub array: \n")
    for ( s in tempArray)
    {
        println("$s")
    }



}
