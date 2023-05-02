object Pangram {
  fun isPangram(input: String): Boolean {
    val alphabet = listOf<Char>('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
      'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
      'u', 'v', 'w', 'x', 'y', 'z')
    return alphabet.all { it in input } 
  }
}
