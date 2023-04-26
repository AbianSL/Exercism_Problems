object WordCount {

  fun phrase(phrase: String): Map<String, Int> {
    var result = mutableMapOf<String, Int>()
    var delimiters = Regex("[\t\n \'\",:!·\$%&/@^|]")
    phrase.lowercase().split(delimiters).filter{ 
      it.isNotBlank()
    }.forEach {
      val word = it.forEach {
        it.isLetter()
      }
      if (result.containsKey(it)) {
        result[it] = result[it]!! + 1 
      } else {
        result.put(it, 1)
      } 
    } 
    return result
  }
}
