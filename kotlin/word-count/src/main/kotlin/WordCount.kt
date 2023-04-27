object WordCount {

  fun phrase(phrase: String): Map<String, Int> {
    var result = mutableMapOf<String, Int>()
    ListWord(phrase).forEach { 
      if (result.containsKey(it)) {
        result[it] = result[it]!! + 1 
      } else {
        result.put(it, 1)
      } 
    } 
    return result
  }

  private fun ListWord(phrase: String): List<String> {
    var result = mutableListOf<String>()
    var delimiters = Regex("[\t\n ,]")
    phrase.lowercase().split(delimiters).forEach {
      var word = ""
      var original_word = it
      if (it.isNotBlank()) {
        it.forEachIndexed { index, element ->      
          if ((index != 0 &&
              element == '\'' &&
              original_word.length != index) ||
              element.isLetterOrDigit()) {
            word += element
          }
        }
        result.add(word)
      }
    }
    return result
  }
}
