

object q7_3 {

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Lambda function to check if a number is prime
    val isPrime = (num: Int) => {
      if (num <= 1) false
      else if (num == 2) true
      else if (num % 2 == 0) false
      else !(3 to Math.sqrt(num).toInt by 2).exists(num % _ == 0)
    }

    // Filter the prime numbers using the lambda function
    val primeNumbers = numbers.filter(isPrime)

    // Print the prime numbers
    println(s"Prime numbers: ${primeNumbers.mkString(", ")}")
  }
}
