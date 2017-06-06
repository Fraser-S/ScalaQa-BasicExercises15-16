/**
  * Created by Fraser on 05/06/2017.
  */
object Main {

  //returns true if the number is not zero
  def notZero(number : Int) : Boolean = number match {
    case 0 => false
    case _ => true
  }

  def addition(num1 : Int, num2 : Int) : Int = {
    var outcome1 : Int = 0

    //check number1 if its zero set pass to false
    var pass : Boolean = notZero(num1)
    //if pass is true set outcome1 to 1 else 0
    pass match{
      case true => outcome1 = 1
      case false => outcome1 = 0
    }

    //check number1 if its zero set pass to false
    pass = notZero(num2)
    var outcome2 : Int = 0
    //if pass is true set outcome2 to 2 else 0
    pass match{
      case true => outcome2 = 2
      case false => outcome2 = 0
    }

    //add outcome 1 to outcome 2
    val outcome3 : Int = outcome1+outcome2
    //switch outcome3
    outcome3 match{
      case 0 => 0 //both were 0 so return o
      case 1 => num1 //num2 was 0 so return num1
      case 2 => num2 //num1 was 0 so return num2
      case 3 => num2+num1 //both had value so add them
      case _ => println("Error number out of expected range"); 0
    }
  }

  def multiplication(num1 : Int, num2 : Int) : Int = {
    var outcome1 : Int = 0

    //check number1 if its zero set pass to false
    var pass : Boolean = notZero(num1)
    //if pass is true set outcome1 to 1 else 0
    pass match{
      case true => outcome1 = 1
      case false => outcome1 = 0
    }

    //check number1 if its zero set pass to false
    pass = notZero(num2)
    var outcome2 : Int = 0
    //if pass is true set outcome2 to 2 else 0
    pass match{
      case true => outcome2 = 2
      case false => outcome2 = 0
    }

    //add outcome 1 to outcome 2
    val outcome3 : Int = outcome1+outcome2

    //switch outcome3
    outcome3 match{
      case 0 => 0 //both were 0 so return o
      case 1 => num1 //num2 was 0 so return num1
      case 2 => num2 //num1 was 0 so return num2
      case 3 => num2*num1 //both had value so add them
      case _ => println("Error number out of expected range"); 0
    }
  }

  def calculate(num1 : Int, num2 : Int, add : Boolean) : Int = {
    add match{
      case true => addition(num1, num2)
      case false => multiplication(num1, num2)
    }
  }

  def swapNumbers(numbers : Any) : Any = numbers match{
    case arrayItem:Array[Int] => Array(arrayItem(1), arrayItem.head)
    case listItem:List[Int] => List(listItem(1), listItem(0));
    case tupleItem:Tuple2[Int, Int] => Tuple2(tupleItem._2, tupleItem._1)
    case _ => println("not a handled type")
  }

  def main(args : Array[String]) : Unit = {
    val add : Boolean = true
    val multiply : Boolean = false

    //test the different parameters
    println("2 + 5 = " + calculate(2,5, add))//test adding
    println("2 * 5 = " + calculate(2,5,multiply))//test multiplying
    println("0,5 passed: " + calculate(0,5,multiply))//test multiplying with a single 0
    println("2,0 passed: " + calculate(2,0,add))//test adding with a single 0
    println("0,0 passed: " + calculate(0,0,add))//test adding with a two 0

    //add a blank line
    println()
    println("Array(1,2), swap numbers: "+swapNumbers(Array(1,2)).toString)
    println("List(3,4), swap numbers: "+swapNumbers(List(3,4)).toString())
    println("Tuple(5,6), swap numbers: "+swapNumbers(Tuple2(5, 6)).toString())
    println("Array(1,2,3,4,5), swap numbers: "+swapNumbers(Array(1,2,3,4,5)).toString())
  }
}
