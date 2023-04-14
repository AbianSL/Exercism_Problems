class Squares {
  private val since_value: Int
  constructor(number_sum: Int) {
    since_value = number_sum 
  }

  fun sumOfSquares(): Int {
    var sum: Int = 0
    for (i in 1..since_value) {
      sum += i * i 
    }
    return sum 
  }

  fun squareOfSum(): Int {
    var sum: Int = 0
    for (i in 1..since_value) {
      sum += i 
    }
    return sum * sum 
  }

  fun difference() {
      TODO("Implement the function to complete the task")
  }
}
