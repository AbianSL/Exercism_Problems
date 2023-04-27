class RotationalCipher {

    // TODO: Implement proper constructor
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
      val Size = 'A'.toInt() - 'Z'.toInt()
      when(letter) {
        in 'z'..'A' -> return (letter.toInt() - 'z'.toInt()).toChar() + shiftKey_  
        in 'A'..'Z' -> return if (letter.toInt() +  shiftKey_ > 'Z'.toInt()) {
                                return (letter.toInt() - Size).toChar()
                              } else {
                                return letter
                              }
        else -> return (letter.toInt() + shiftKey_).toChar()
      }
      return letter 
    }
}
