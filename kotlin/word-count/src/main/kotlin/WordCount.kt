object WordCount {

  fun phrase(phrase: String): Map<String, Int> {
    var result = mutableMapOf<String, Int>() 
    phrase.lowercase().split(" ").forEach {
      if (result.containsKey(it)) {
        result[it] = result[it]!! + 1 
      } else {
        result.put(it, 1)
      } 
    } 
    return result
  }
}
