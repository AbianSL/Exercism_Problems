object Hamming {

  fun compute(leftStrand: String, rightStrand: String): Int {
    var counter: Int = 0
    if (leftStrand.length != rightStrand.length) {
      throw IllegalArgumentException("left and right strands must be of equal length")
    }
    var char_counter: Int = 0
    leftStrand.forEach {
      if (it != rightStrand.get(char_counter)) {
        ++counter
      } 
      ++char_counter
    }
    return counter
  }
}
