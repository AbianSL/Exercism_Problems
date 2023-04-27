class RotationalCipher {

    // TODO: Implement proper constructor
    val shiftKey_: Int
    constructor(shiftKey: Int) {
      shiftKey_ = shiftKey
    }

    fun encode(text: String): String {
      
      return ""
    }

    private fun encodeChar(letter: Char): Char {
      when(letter + shiftKey_) {
        in 'z'..'A' -> return (letter.toInt() - 'z'.toInt()).toChar() + shiftKey_ 
        > 'Z' -> return (letter.toInt() - 'Z'.toInt()).toChar() + shiftKey_
        else -> return (letter.toInt() + shiftKey_).toChar()
      }
      return letter 
    }
}
