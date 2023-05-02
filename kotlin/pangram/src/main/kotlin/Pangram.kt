object Pangram {
  fun isPangram(input: String): Boolean {
    var reversed_input: String = ""
    for (i in input.length..0) {
      reversed_input += i 
    } 
    return reversed_input == input
  }
}
