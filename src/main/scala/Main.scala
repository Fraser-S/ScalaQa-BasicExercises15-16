/**
  * Created by Fraser on 05/06/2017.
  */
object Main {
  //adds two value together if add is true,if false will multiply them together. will return the larger number if um1 or num2 is 0

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
    }
  }

  def calculate(num1 : Int, num2 : Int, add : Boolean) : Int = {
    add match{
      case true => addition(num1, num2)
      case false => multiplication(num1, num2)
    }
  }

  def main(args : Array[String]) : Unit = {
    println("2 + 5 = " + calculate(2,5, true))
    println("2 * 5 = " + calculate(2,5,false))
    println("0,5 passed: " + calculate(0,5,false))
    println("2,0 passed: " + calculate(2,0,true))
  }
}
