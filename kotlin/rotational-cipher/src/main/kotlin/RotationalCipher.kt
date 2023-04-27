class RotationalCipher {

    val shiftKey_: Int
    constructor(shiftKey: Int) {
      shiftKey_ = shiftKey
    }

    fun encode(text: String): String {
      var result = StringBuilder(text)
      text.forEachIndexed { index, it ->
        if(result[index] != ' ') {
          result[index] = encodeChar(it)         
        }  
      }
      return result.toString()
    }

    private fun encodeChar(letter: Char): Char {  
      var result = (letter.toInt() + shiftKey_).toChar()
      val range_symbol = 'z'.toInt() - 'a'.toInt() + 1
      var max_symbol: Char
      if (letter.isUpperCase()) {
        max_symbol = 'Z' 
      } else {
        max_symbol = 'z'
      }
      if (letter.isLetter()) {
          while (result > max_symbol) {
            result = (result.toInt() - range_symbol).toChar()
          } 
      }
      return result
    }
}
