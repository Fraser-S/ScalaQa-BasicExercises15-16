/**
  * Created by Fraser on 05/06/2017.
  */
object Main {
  //adds two value together if add is true,if false will multiply them together. will return the larger number if um1 or num2 is 0

  def notZero(number : Int) : Boolean = number match {
    case 0 => false
    case _ => true
  }

  def add(num1 : Int, num2 : Int) : Int = {
    var outcome : Int = 0

    val pass = notZero(num1)
    pass match{
      case true => outcome = 0
      case false => outcome = 1
    }

    var pass = notZero(num1)
    pass match{
      case true => outcome = 0
      case false => outcome = 1
    }

    addValue match{
      case true
    }
  }

  def Calculate(num1 : Int, num2 : Int, add : Boolean) : Int = {
    add match{
      case true => num1+num2
      case false => num1*num2
    }
  }

  def main(args : Array[String]) : Unit = {
    println("2 + 5 = " + addition(2,5, true))
    println("2 * 5 = " + addition(2,5,false))
    //println("0,5 passed: " + addition(0,5,false))
    //println("2,0 passed: " + addition(2,0,true))
  }
}
