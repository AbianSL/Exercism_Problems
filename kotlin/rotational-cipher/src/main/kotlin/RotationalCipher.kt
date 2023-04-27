class RotationalCipher {

    val shiftKey_: Int
    constructor(shiftKey: Int) {
      shiftKey_ = shiftKey
    }

    fun encode(text: String): String {
      var result = StringBuilder(text)
      text.filter {
        it != ' ' 
      }.forEachIndexed { index, it ->
        result[index] = encodeChar(it) 
      }
      return result.toString()
    }

    private fun encodeChar(letter: Char): Char {
      var result = (letter.toInt() + shiftKey_).toChar()
      var max_symbol: Char
      if (letter.isUpperCase()) {
        max_symbol = 'Z' 
      } else {
        max_symbol = 'z'
      }
      if (letter.isLetter()) {
          while (result > max_symbol) {
            result = (result.toInt() - max_symbol.toInt()).toChar()
          } 
      }
      return result
    }
}
