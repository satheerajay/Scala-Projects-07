

object q7_1 {
  def filterEvenNumbers(lis : List[Int]) : List[Int] = {
    lis.filter(_ % 2 == 0)
  }

  def main(args: Array[String]): Unit = {

    val numbers=List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val answer=filterEvenNumbers(numbers)

    println(answer.mkString("[", ", ", "]"))

  }

}
