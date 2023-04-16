import Signal.*

object HandshakeCalculator {
  fun calculateHandshake(number: Int): List<Signal> {
    val handshake = mutableListOf<Signal>()
    var copy = number
    var reverse: Boolean = false
    while (copy > 0) {
      if (copy - 16 >= 0) {
        copy -= 16
        reverse = true
      } else if (copy - 8 >= 0) {
        copy -= 8
        handshake.add(0, JUMP)
      } else if (copy - 4 >= 0) {
        copy -= 4
        handshake.add(0, CLOSE_YOUR_EYES)
      } else if (copy - 2 >= 0) {
        copy -= 2
        handshake.add(0, DOUBLE_BLINK) 
        println(handshake)
      } else if (copy - 1 >= 0) {
        copy -= 1
        handshake.add(0, WINK)
        println(handshake)
      }
    }
    if (reverse) {
      handshake.reverse()
    } 
    return handshake 
  }
}
