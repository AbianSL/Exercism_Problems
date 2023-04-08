object Hamming {

  fun compute(leftStrand: String, rightStrand: String): Int {
    var counter: Int = 0
    leftStrand.forEach {
      val first: Char = it
      rightStrand.forEach {
        if (first != it) {
          ++counter
        }
      }
    }
    return counter
  }
}
