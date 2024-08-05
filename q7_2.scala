

object q7_2 {

  def calculateSquare(lis: List[Int]): List[Int] = {
    lis.map(x => x * x)
  }
  def main(args: Array[String]): Unit = {

    val numbers=List(1, 2, 3, 4, 5)
    val answer=calculateSquare(numbers)
    println(answer.mkString("[", ", ", "]"))


  }

}
